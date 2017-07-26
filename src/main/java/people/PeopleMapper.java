package people;

import java.util.List;
import java.util.Map;

public interface PeopleMapper {


    Map<Gender, Long> getNumberOfPeopleByGender(List<Person> people);

    Map<Gender, List<String>> listOfPeopleByGender(List<Person> people);

}
