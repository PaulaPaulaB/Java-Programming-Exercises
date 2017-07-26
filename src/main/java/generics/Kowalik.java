package generics;

/**
 * Kowalik shoud implement interface Bird
 * Kowali can eat 1 seed at once
 */
public class Kowalik implements Bird {

    int howMuchEatKowalik = 1;

    public void eatSeed(Plate talerzyk) throws NoMoreSeedException {
        talerzyk.eatSeed(howMuchEatKowalik);
    }

    @Override
    public String toString() {
        return "Kowalik";
    }
}
