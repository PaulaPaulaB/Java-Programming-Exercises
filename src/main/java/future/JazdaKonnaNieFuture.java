package future;


public class JazdaKonnaNieFuture implements Runnable {

    private final int czasJazdy;

    public JazdaKonnaNieFuture(int czas) {
        this.czasJazdy = czas;
    }

    @Override
    public void run() {
        System.out.println();
        try {
            Thread.sleep(czasJazdy);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
