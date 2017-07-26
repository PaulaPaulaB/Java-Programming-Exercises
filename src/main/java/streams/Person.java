package streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//TODO: make this class immutable
public class Person {

    private final String name;
    private final Integer age;
    private final Set<Pet> pets;

    public Person(String name, Integer age, Set<Pet> pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Set<Pet> getPets() {
        return Collections.unmodifiableSet(pets);
    }
}
