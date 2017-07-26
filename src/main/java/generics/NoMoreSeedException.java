package generics;

public class NoMoreSeedException extends Exception {

    public NoMoreSeedException() {

    }

    public NoMoreSeedException(String message) {
        super(message);
    }

    public NoMoreSeedException(Throwable cause) {
        super(cause);
    }

    public NoMoreSeedException(String message, Throwable cause) {
        super(message, cause);
    }
}
