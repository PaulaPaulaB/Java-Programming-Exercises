package blockingqueue;

import sun.java2d.loops.GraphicsPrimitive;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueue {

    public static void main(String[] args) {

        LinkedBlockingQueue queue = new LinkedBlockingQueue(5);
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);

        Thread threadConsumer = new Thread(consumer);
        Thread threadProducer = new Thread(producer);

        threadConsumer.start();
        threadProducer.start();
    }
}
