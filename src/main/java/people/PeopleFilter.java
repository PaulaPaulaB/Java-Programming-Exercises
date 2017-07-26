package people;

import java.util.List;
import java.util.Map;
import java.util.Set;

//implement interface, make use of java.util.Collection stream method
//remeber to use @Override annotation
public interface PeopleFilter {


    List<Person> olderThanFifteenYears(List<Person> people);

    Integer oldestAge(List<Person> people);

    List<String> allNamesStartsWithLetter(String letter, List<Person> people);

    Set<String> getUniqueNames(List<Person> people);

    Integer getTotalAgeOfAllFemales(List<Person> people);

    List<Person> orderByAge(List<Person> people);


}
