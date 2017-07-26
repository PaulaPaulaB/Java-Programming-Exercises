package people;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


//make use of assert methods from org.junit.Assert class
public class PeopleFilterTest {


    //  @BeforeClass
    public static void setBeforeTests() {
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
    }


    @Test
    public void olderThanFifteenYearsTestreturnList() {

        Person czlowiek2 = new Person("Zosia", "Kowalska", 30, Gender.Kobieta);
        Person czlowiek3 = new Person("Zuza", "Kowalska", 54, Gender.Kobieta);
        Person czlowiek4 = new Person("Zbyszek", "Kowalik", 65, Gender.Facet);

        List<Person> controlGroup = new ArrayList<>();

        controlGroup.add(czlowiek2);
        controlGroup.add(czlowiek3);
        controlGroup.add(czlowiek4);

        ExampleFilter exampleFilter = new ExampleFilter();

        List<Person> correctaAns = new ArrayList<>();

        correctaAns.add(czlowiek3);
        correctaAns.add(czlowiek4);

        Assert.assertEquals("olderThanFifteenYearsTest went wrong", correctaAns, exampleFilter.olderThanFifteenYears(controlGroup));

    }


    @Test
    public void oldestAgeMethodShouldReturnAgeOfOldestPerson() {
        Person czlowiek4 = new Person("Zbyszek", "Kowalik", 65, Gender.Facet);
        Person czlowiek5 = new Person("Antek", "Sikorka", 5, Gender.Facet);

        List<Person> controlGroup = new ArrayList<>();
        ExampleFilter exampleFilter = new ExampleFilter();


        controlGroup.add(czlowiek4);
        controlGroup.add(czlowiek5);

        Integer correctAns = 65;
        Assert.assertEquals("oldestAge test went wrong", correctAns, exampleFilter.oldestAge(controlGroup));
    }


    @Test
    public void allNamesStartsWithLetterTestShouldReturnListOfName() {

        Person czlowiek1 = new Person("Jan", "Nowak", 27, Gender.Facet);
        Person czlowiek2 = new Person("Zosia", "Kowalska", 30, Gender.Kobieta);
        Person czlowiek3 = new Person("Zuza", "Kowalska", 54, Gender.Kobieta);

        List<Person> controlGroup = new ArrayList<>();
        ExampleFilter exampleFilter = new ExampleFilter();


        controlGroup.add(czlowiek1);
        controlGroup.add(czlowiek2);
        controlGroup.add(czlowiek3);

        List<String> correctAns = new ArrayList<>();
        correctAns.add("Zosia");
        correctAns.add("Zuza");

        Assert.assertEquals("allNameStartsWithLetter Test went wring",
                correctAns, exampleFilter.allNamesStartsWithLetter("Z", controlGroup));

    }

    @Test

    public void getUniqueNamesTestShouldReturnSetOfNamesWithoutRepetition() {

        Person czlowiek1 = new Person("Jan", "Nowak", 27, Gender.Facet);
        Person czlowiek2 = new Person("Jan", "Kowalska", 30, Gender.Kobieta);
        Person czlowiek3 = new Person("Zuza", "Kowalska", 54, Gender.Kobieta);

        List<Person> controlGroup = new ArrayList<>();
        ExampleFilter exampleFilter = new ExampleFilter();


        controlGroup.add(czlowiek1);
        controlGroup.add(czlowiek2);
        controlGroup.add(czlowiek3);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Jan");
        uniqueNames.add("Zuza");

        Assert.assertEquals("  getUniqueNamesTest went wrong", uniqueNames, exampleFilter.getUniqueNames(controlGroup));

    }


}
