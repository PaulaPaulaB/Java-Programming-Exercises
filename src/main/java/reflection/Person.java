package reflection;


@Girl
public class Person {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName2() {
        return name;
    }

    private Integer getAge() {
        return age;
    }

}

