package exceptions;

public class HomeException extends Exception {


    public HomeException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "HomeExcepion";
    }
}
