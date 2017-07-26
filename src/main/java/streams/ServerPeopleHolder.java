package streams;

import java.util.List;
import java.util.stream.Collectors;

public class ServerPeopleHolder implements MyFilter {

    @Override
    public List<Person> getPeopleWithoutPets(List<Person> people) {
        return people
                .stream()
                .filter(p -> p.getPets().isEmpty())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getNamesOfPeopleWithPets(List<Person> people) {
        return people
                .stream()
                .filter(p -> !(p.getPets().isEmpty()))
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    @Override
    public Double getAvaragePetAge(List<Person> people) {
        return people
                .stream()
                .flatMap(person -> person.getPets().stream())
                .mapToDouble(pet -> pet.getAge())
                .average()
                .getAsDouble();
    }
}
