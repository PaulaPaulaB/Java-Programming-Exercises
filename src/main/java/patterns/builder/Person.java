package patterns.builder;

public class Person {

    private final String name;
    private final Integer age;
    private final String birthPlace;


    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.birthPlace = personBuilder.birthPlace;
    }

    public static PersonBuilder builder() {

        return new PersonBuilder();
    }


    public static class PersonBuilder {

        private String name;
        private Integer age;
        private String birthPlace;

        public PersonBuilder name(String name) {

            this.name = name;
            return this;
        }

        public Person build() {

            return new Person(this);
        }

        public PersonBuilder age(Integer age) {

            this.age = age;
            return this;
        }

        public PersonBuilder birthPlace(String birthPlace) {

            this.birthPlace = birthPlace;
            return this;
        }
    }

}
