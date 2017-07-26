package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Make Paulinka extend Person and implement Dancer and Student of Java8Course
 */
public class Paulinka extends Person implements Dancer, Student<Java8Course> {

    private final List<String> flowers = new ArrayList<>();

    public Paulinka(String name, Integer age, Sex sex) {
        super(name, age, sex);
    }

    List<String> getFlowers() {
        return Collections.unmodifiableList(flowers);
    }

    @Override
    public void doHobby() {
    }

    @Override
    public void dance() {
    }

    @Override
    public void warmUp() {
    }

    @Override
    public void learn() {
    }

    //TODO:
    //create toString method that uses toString from parent class and concat flowers
    @Override
    public String toString() {

        String s = super.toString();

        s = s + "flowers:\n";
        s = s + flowers.stream().collect(Collectors.joining(","));

        return s;
    }
}
