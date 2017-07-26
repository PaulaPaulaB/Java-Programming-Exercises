package inheritance;

/**
 * Create abstract method getAddress
 */
public abstract class Person implements HasHobby {

    private final String name;
    protected final Integer age;
    protected final Sex sex;

    Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    public enum Sex implements HasAvarageHeight {

        FEMALE(160), MALE(170);

        private final Integer averageHeight;

        Sex(int averageHeight) {
            this.averageHeight = averageHeight;
        }

        @Override
        public Integer getAverageHeight() {
            return this.averageHeight;
        }

    }
}
