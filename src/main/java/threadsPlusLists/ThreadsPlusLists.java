package threadsPlusLists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsPlusLists {

    public static final AtomicInteger myCounter = new AtomicInteger(0);

    public static void main(String[] args) {
        MyThread myThreadNumberOne = new MyThread();
        MyThread myThreadNumberTwo = new MyThread();
        MyThread myThreadNumberTree = new MyThread();

        Thread threadNumberOne = new Thread(myThreadNumberOne);
        threadNumberOne.start();

        Thread threadNumberTwo = new Thread(myThreadNumberTwo);
        threadNumberTwo.start();

        Thread threadNumberTree = new Thread(myThreadNumberTree);
        threadNumberTree.start();

        System.out.println("Koniec wyliczania czas na listy");

        List<Integer> myList = new ArrayList<>();
        myList.add(0);

        MyThreadList myThreadListOne = new MyThreadList(myList, "watek 1");
        MyThreadList myThreadListTwo = new MyThreadList(myList, "watek 2");

        Thread threadListOne = new Thread(myThreadListOne);
        threadListOne.start();

        Thread threadLIstTwo = new Thread(myThreadListTwo);
        threadLIstTwo.start();
    }
}
