package exceptions;

public class DoorException extends RuntimeException {

    public DoorException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "Door exception";
    }
}
