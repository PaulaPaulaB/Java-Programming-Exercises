package future;

import java.util.concurrent.Callable;

public class JazdaKonna implements Callable<String> {

    private final int czasJazdy;

    public JazdaKonna(int czas) {
        this.czasJazdy = czas;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(czasJazdy);
        return Thread.currentThread().getName();
    }
}
