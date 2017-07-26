package concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Incrementer implements Runnable {

    private final Object instanceMutex = new Object();
    private final static Object classMutex = new Object();
    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            Integers.ai.incrementAndGet();
            System.out.println(Thread.currentThread().getName() + " : " + Integers.i++);
            synchronized (instanceMutex) {
                Integers.synchroniezedOnInstance++;
            }
            synchronized (classMutex) {
                Integers.synchroniezedOnClass++;
            }
            try {
                lock.lock();
                Integers.lockedInteger++;
            } finally {
                lock.unlock();
            }
        }
    }
}
