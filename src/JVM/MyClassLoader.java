package JVM;

import JVM.classloading.Test;

import java.util.concurrent.TimeUnit;

/**
 * @Author: xiantang
 * @Date: 2019/7/14 10:13
 */
public class MyClassLoader extends ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, IllegalAccessException, InstantiationException {
        new Test().tell();
        System.out.println("start");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("load Class");
        Class a = new MyClassLoader().loadClass("JVM.classloading.Test");
        ((Test) a.newInstance()).tell();
        new Test().tell();
    }
}
