package streams;

import java.util.Collections;
import java.util.List;

//TODO: make this class unmodifiable
public class Pet {

    private final Integer age;
    private final String name;
    private final List<String> toys;

    public Pet(int age, String name, List<String> toys) {
        this.age = age;
        this.name = name;
        this.toys = toys;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getToys() {
         return Collections.unmodifiableList(toys);
    }


}
