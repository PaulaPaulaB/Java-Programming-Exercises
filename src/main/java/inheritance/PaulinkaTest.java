package inheritance;

import org.junit.Test;

public class PaulinkaTest {

    @Test
    public void test() {
        Paulinka paulinkaInheritance = new Paulinka("Paulina", 28, Person.Sex.FEMALE);
        //create Paulinka
        //do dance lesson

        paulinkaInheritance.dance();
        paulinkaInheritance.doHobby();
        paulinkaInheritance.learn();

        //do hobby
        //do java8 course
        // print all Paulinkas details (age, name, address, flowers, sex, average gender height
    }


}
