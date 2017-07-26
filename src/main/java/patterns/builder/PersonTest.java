package patterns.builder;

import org.junit.Test;


public class PersonTest {

    @Test
    public void creationTest() {

        Person person = Person.builder()
                .name("kasia")
                .age(22)
                .birthPlace("Krakow")
                .build();

        PersonLombok.builder().age(11).name("asd").build();

    }
}
