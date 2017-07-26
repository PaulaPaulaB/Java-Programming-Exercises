package generics;

public class BalkonPaulinkiAndRadzia {

    public static void main(String[] args) {
        Paulinka paulinka = new Paulinka();
        Plate plateKowalikow = new Plate(20);
        BirdFeeder<Kowalik> karmnikKowalika = new BirdFeeder<>(plateKowalikow);
        Kowalik kowalik1 = new Kowalik();
        Kowalik kowalik2 = new Kowalik();

        try {
            karmnikKowalika.birdFlewIn(kowalik1);
            karmnikKowalika.birdFlewIn(kowalik2);
        } catch (NoMoreSeedException e) {
            System.out.println("Ptaszki nie mają poco przylatywac - brak ziarenek na talerzu");
        }
        System.out.println("Pozostala ilosc ziaren slonecznika: " + karmnikKowalika.getAvailableSeed());
        System.out.println("Sprawdzenie gosci w karmniku: ");
        paulinka.liczePtaszki(karmnikKowalika);
        karmnikKowalika.scareBirds();
    }
}
