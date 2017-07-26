package generics;


import java.util.Set;

public class Paulinka {

    public void liczePtaszki(BirdFeeder<? extends Bird> birdFeeder) {

        final Set<? extends Bird> ptaszki = birdFeeder.listBirdsInsideFeeder();

        for (Bird bird : ptaszki) {
            System.out.println(bird);
        }
    }

}
