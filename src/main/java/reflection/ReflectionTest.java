package reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionTest {


    @Test
    public void reflectionTest() {
        Person person = new Person("Paula", 18);
        /*
        print person object details:
        - package
        - class name
        - fields names
        - method names and access modifiers

         */
        Class c = person.getClass();
        System.out.println("Nazwa pakietu: " + c.getPackage() + ", nazwa klasy: " + c.getSimpleName());
        for (Field field : c.getDeclaredFields()) {
            System.out.println("Nazwa pola: " + field.getName() + " z modyfikaotrem: " + field.getModifiers());
        }
        Method[] methods = c.getDeclaredMethods();
        for (Method method1 : methods) {
            System.out.println("Nazwa metod: " + method1.getName() + ",  z modyfikatorem: " + method1.getModifiers());
        }
    }

    //change access to method and invoke getAge

    @Test
    public void modifyAccessTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person("Paula", 28);
        Class<Person> clazz = Person.class;
        Method method = clazz.getDeclaredMethod("getAge");
        method.setAccessible(true);
        System.out.println(method.invoke(person));
    }
}
