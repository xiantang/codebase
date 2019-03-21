package concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadLocalVariableHolder {
    //
    private static ThreadLocal<Integer> value =
            new ThreadLocal<Integer>() {

                private Random random = new Random(47);

                protected synchronized Integer initialValue() {
                    return random.nextInt(10000);
                }


            };

    public static void increment() {
        value.set(value.get() + 1);
    }

    public static int  getValue() {
        return value.get();
    }
}

public class Accessor implements Runnable {
    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        // 如果当前线程没有被打断
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + ":" + ThreadLocalVariableHolder.getValue();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Accessor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }


}
