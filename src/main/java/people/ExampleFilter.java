package people;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.mapping;

public class ExampleFilter implements PeopleFilter, PeopleMapper {

    @Override
    public List<Person> olderThanFifteenYears(List<Person> people) {

        return people
                .stream()
                .filter(p -> p.getAge() > 50)
                .collect(Collectors.toList());
    }

    @Override
    public Integer oldestAge(List<Person> people) {
        return people
                .stream()
                .map(p -> p.getAge())
                .max((s1, s2) -> Integer.compare(s1, s2))
                .get();
    }

    @Override
    public List<String> allNamesStartsWithLetter(String letter, List<Person> people) {
        return people
                .stream()
                .filter(p -> p.getName().startsWith(letter))
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> getUniqueNames(List<Person> people) {
        return people
                .stream()
                .map(Person::getName)
                .distinct()
                .collect(Collectors.toSet());
    }

    @Override
    public Integer getTotalAgeOfAllFemales(List<Person> people) {
        return people
                .stream()
                .filter(p -> p.getGender() == Gender.Kobieta)
                .mapToInt(p -> p.getAge())
                .sum();
    }

    @Override
    public List<Person> orderByAge(List<Person> people) {
        return people
                .stream()
                .sorted(comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
    }

    public Integer sumOfAllAges(List<Person> people) {
        return people
                .stream()
                .mapToInt(p -> p.getAge())
                .sum();
    }

    @Override
    public Map<Gender, Long> getNumberOfPeopleByGender(List<Person> people) {
        return people
                .stream()
                .map(p -> p.getGender())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    @Override
    public Map<Gender, List<String>> listOfPeopleByGender(List<Person> people) {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getName, Collectors.toList())));
    }
}

