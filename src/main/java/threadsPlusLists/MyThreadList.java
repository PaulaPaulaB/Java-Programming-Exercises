package threadsPlusLists;

import java.util.List;

public class MyThreadList implements Runnable {

    private final List<Integer> list;
    private final String name;
    private final static Object MUTEX = new Object();

    public MyThreadList(List<Integer> list, String name) {
        this.list = list;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (MUTEX) {
            for (int i = 0; i < 10; i++) {
                list.add(list.get(list.size() - 1) + 1);
                System.out.println(list.get(list.size() - 1) + " watek " + name);
            }
        }
    }
}
