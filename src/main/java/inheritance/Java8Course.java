package inheritance;

public class Java8Course implements ExtendedCourse {

    @Override
    public void doIt() {
        System.out.println("Java");
        doAdvancedThings();
    }

    @Override
    public void doAdvancedThings() {
        System.out.println("Java8 lambdas and streams");
    }
}
