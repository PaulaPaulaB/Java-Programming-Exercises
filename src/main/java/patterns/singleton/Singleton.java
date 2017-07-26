package patterns.singleton;

public class Singleton {

    private static Singleton singleton;
    private static final Object MUTEX = new Object();

    private Singleton() {
    }

    public static Singleton getSingleton() {

        synchronized (MUTEX) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }

    }

}
