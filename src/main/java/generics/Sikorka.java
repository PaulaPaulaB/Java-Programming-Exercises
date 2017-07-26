package generics;

/**
 * Sikorka should implement interface
 * Sikorka can eat 2 seeds at once
 */
public class Sikorka implements Bird {

    int howMuchEatSikorka = 2;

    public void eatSeed(Plate talerzyk) throws NoMoreSeedException {
        talerzyk.eatSeed(howMuchEatSikorka);
    }

}
