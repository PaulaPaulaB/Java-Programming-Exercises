package people;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        Person czlowiek1 = new Person("Jan", "Nowak", 27, Gender.Facet);
        Person czlowiek2 = new Person("Zosia", "Kowalska", 30, Gender.Kobieta);
        Person czlowiek3 = new Person("Zuza", "Kowalska", 54, Gender.Kobieta);
        Person czlowiek4 = new Person("Zbyszek", "Kowalik", 65, Gender.Facet);
        Person czlowiek5 = new Person("Antek", "Sikorka", 5, Gender.Facet);
        Person czlowiek6 = new Person("Jan", "Borowski", 27, Gender.Facet);


        List<Person> rodzina = new ArrayList<>();

        rodzina.add(czlowiek1);
        rodzina.add(czlowiek2);
        rodzina.add(czlowiek3);
        rodzina.add(czlowiek4);
        rodzina.add(czlowiek5);
        rodzina.add(czlowiek6);

        ExampleFilter exampleFilter = new ExampleFilter();

        List<Person> olderThen50 = exampleFilter.olderThanFifteenYears(rodzina);
        System.out.println("Osoby starsze niż 50 lat");
        olderThen50.forEach((person) -> System.out.println(person.getName()));

        System.out.println("Osoby z imieniem zaczynajacym sie na litere \"Z\" ");
        List<String> namesOfZ = exampleFilter.allNamesStartsWithLetter("Z", rodzina);
        namesOfZ.forEach((name) -> System.out.println(name));


        System.out.print("Najsarsza osoba ma lat: ");
        Integer ageOfOldestOne = exampleFilter.oldestAge(rodzina);
        System.out.println(ageOfOldestOne);

    }
}

