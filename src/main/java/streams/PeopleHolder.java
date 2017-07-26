package streams;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import streams.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

 public class PeopleHolder {

    static final List<streams.Person> people = new ArrayList<>();

    static {
        people.add(
                new streams.Person(
                        "Paulinka",
                        18,
                        Sets.newHashSet(new Pet(1, "Baśka", Lists.newArrayList("Orzeszek")))
                )
        );
        people.add(
                new streams.Person(
                        "Radek",
                        18,
                        new HashSet<>()
                )
        );
        people.add(
                new streams.Person("Marta",
                        18,
                        Sets.newHashSet(
                                new Pet(6, "Bruno", Lists.newArrayList("Kocyk", "Piłka")),
                                new Pet(7, "Arwena", Lists.newArrayList("Kość", "Mysz")),
                                new Pet(5, "Lolusia", Lists.newArrayList("Mysz", "Ludzie"))
                        )
                )
        );
    }

    public static List<streams.Person> getPeople(){

        return  Collections.unmodifiableList(people);
    }

}
