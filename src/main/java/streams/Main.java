package streams;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ServerPeopleHolder serverPeopleHolder = new ServerPeopleHolder();

        List<Person> peopleWithoutPets = serverPeopleHolder.getPeopleWithoutPets(PeopleHolder.getPeople());
        peopleWithoutPets.forEach(person -> System.out.println("nie ma zwierzaka: " + person.getName()));

        List<String> peopleWithPets = serverPeopleHolder.getNamesOfPeopleWithPets(PeopleHolder.getPeople());
        peopleWithPets.forEach(p -> System.out.println("ma zwierzaka: " + p));
    }
}
