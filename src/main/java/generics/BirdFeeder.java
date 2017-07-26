package generics;


import java.util.HashSet;
import java.util.Set;

/**
 * Make class BirdFeeder generic
 * So that you can create seperate karmnik for Kowalik
 * and seperate karmnik for Sikorka
 * Create third karmnik object where both sikorka and kowalik can eat seed;
 * <p>
 * Bird flews in to the feeder and immediately eats seed
 * bird stay in the feeder until method scareBirds is invoked
 */

public class BirdFeeder<T extends Bird> {

    private final Set<T> birds = new HashSet<>();
    private final Plate plate;

    public BirdFeeder(Plate plate) {
        this.plate = plate;
    }

    public void birdFlewIn(T bird) throws NoMoreSeedException {
        this.birds.add(bird);
        bird.eatSeed(plate);
    }

    public int getAvailableSeed() {
        return plate.getSeed();
    }

    public Set<T> listBirdsInsideFeeder() {
        return this.birds;
    }

    public void scareBirds() {
        birds.clear();
    }
}
