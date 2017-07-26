package threads;

public class Karmnik {

    volatile int iloscWydziubanychZiarenek = 0;
    int iloscZrobionychKupek = 0;

    public int getIloscWydziubanychZiarenek() {
        return iloscWydziubanychZiarenek;
    }

    public int getIloscZrobionychKupek() {
        return iloscZrobionychKupek;
    }


    private final Object BLOKADA_JEDZONKA = new Object();
    private final Object BLOKADA_KUPKI = new Object();

    void doDziubka(Sikorka ptak) {

        System.out.println("słonecznik do dziubka " + ptak.getName());

        try {
            synchronized (BLOKADA_JEDZONKA) {
                iloscWydziubanychZiarenek++;
                System.out.println("Sikorka " + ptak.getName() + "zjadla 1 ziarenko i 20ms myśli co zrobić");
                Thread.sleep(20);
                System.out.println("zjedzonych ziarenek :" + iloscWydziubanychZiarenek);

            }


        } catch (InterruptedException e) {

            System.out.println("Przerwano");
        }

    }

    void zrobKupke(Sikorka sikorka) {
        //synchronized (BLOKADA_JEDZONKA) {

        System.out.println("Sikorka " + sikorka.getName() + " robi kupke");
        iloscZrobionychKupek++;
        try {
            Thread.sleep(20);
            System.out.println("Razem kupek: " + iloscZrobionychKupek);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //}
    }

}
