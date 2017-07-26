package threadsPlusLists;

import static threadsPlusLists.ThreadsPlusLists.myCounter;


public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myCounter.incrementAndGet();
        }
    }
}
