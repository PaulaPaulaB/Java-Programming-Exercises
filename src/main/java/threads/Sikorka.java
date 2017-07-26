package threads;

public class Sikorka implements Runnable {

    final String name;

    final Karmnik karmnik;

    private void giveASound() {

        System.out.println(name);
        System.out.println("cwir cwir");
    }

    public void podziubajZKarminka() {
        karmnik.doDziubka(this);
    }

    Sikorka(String name, Karmnik karmnik) {
        this.name = name;
        this.karmnik = karmnik;
    }

    @Override
    public void run() {


        for (int i = 0; i < 30; i++) {
                giveASound();
                podziubajZKarminka();
                zrobKupke();
            }



        System.out.println("Zakonczono watek " + name);
    }

    private void zrobKupke() {
        karmnik.zrobKupke(this);
    }

    public String getName() {
        return name;
    }
}
