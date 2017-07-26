package blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

    private final LinkedBlockingQueue queue;

    public Consumer(LinkedBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (; ; ) {
            try {
                System.out.println("Baran nr: " + queue.take());
            } catch (InterruptedException e) {
                System.out.println("InterruptedException w watku Consumer");
            }
        }
    }
}
