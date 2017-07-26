package inheritance;

public class JavaCourse implements Course {

    @Override
    public void doIt() {
        System.out.println("JavaCourse::doIt Java course!");
    }
}
