package inheritance;

public interface Student<T extends Course> {

    void learn();
}
