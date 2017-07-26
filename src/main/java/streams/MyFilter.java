package streams;

import java.util.List;

public interface MyFilter {

    List<Person> getPeopleWithoutPets(List<Person> people);

    List<String> getNamesOfPeopleWithPets(List<Person> people);

    Double getAvaragePetAge(List<Person> people);

}
