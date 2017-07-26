package exceptions;


public class NoFurnitureException extends HomeException {

    public NoFurnitureException(String s) {
        super(s);
    }

    @Override
    public String toString(){
        return "No furniture in the house exception";
    }

}

