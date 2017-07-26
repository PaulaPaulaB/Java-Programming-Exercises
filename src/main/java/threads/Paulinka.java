package threads;

public class Paulinka implements Runnable {

    private final Karmnik karmnik;

    public Paulinka(Karmnik karmnik) {
        this.karmnik = karmnik;
    }

    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println("Paulinka widzi , że jest " + karmnik.getIloscWydziubanychZiarenek() + " wydziubanych ziarenek");
            System.out.println("Paulinka widzi , że jest " + karmnik.getIloscZrobionychKupek() + " zrobionych kupek");
        }
    }
}
