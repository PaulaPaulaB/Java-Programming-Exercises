package inheritance;

public class Lesson {

    public void startToLearn(Student<? extends Lesson> student) {
        student.learn();
    }

}
