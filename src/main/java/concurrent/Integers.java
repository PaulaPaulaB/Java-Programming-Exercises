package concurrent;

import java.util.concurrent.atomic.AtomicInteger;


public class Integers {

    public static Integer i = 0;
    public static AtomicInteger ai = new AtomicInteger(0);
    public static Integer synchroniezedOnInstance = 0;
    public static Integer synchroniezedOnClass = 0;
    public static Integer lockedInteger = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();
        new Thread(new Incrementer()).start();

        Thread.sleep(1300);

        System.out.println(i);
        System.out.println(ai);
        System.out.println(synchroniezedOnInstance);
        System.out.println(synchroniezedOnClass);
        System.out.println(lockedInteger);
    }
}