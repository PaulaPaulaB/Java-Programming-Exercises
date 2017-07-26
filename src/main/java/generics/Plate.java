package generics;

/**
 * When there are no seed in plate
 * method wezZiarenko should throw
 * NoMoreSeedException
 * seed should be initiaized in constructor
 */
public class Plate {

    private int seed;

    public Plate(int seed) {
        this.seed = seed;
    }

    public void eatSeed(int numberOfSeedsToEat) throws NoMoreSeedException {
        if ((this.seed - numberOfSeedsToEat) >= 0) {
            this.seed = this.seed - numberOfSeedsToEat;
        } else {
            throw new NoMoreSeedException("Nie ma już ziarenek w karmniku");
        }
    }

    public int getSeed() {
        return seed;
    }

}
