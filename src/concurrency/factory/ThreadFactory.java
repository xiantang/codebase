package concurrency.factory;

public interface ThreadFactory {
    Thread newThread(Runnable r);
}
