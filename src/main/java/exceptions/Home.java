package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private final List<String> furniture = new ArrayList<>();
    private String address;
    private boolean isFinished;
    private Boolean hasDoor;

    //when the list of furniture is empty throw new NoFurnitureException extends HomeException which is type of checked exception (not runtime)
    public List<String> getFurniture() throws NoFurnitureException {
        if (furniture.isEmpty()) {
            throw new NoFurnitureException("No furniture in the house");
        } else {
            return furniture;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //check if address is null, if so throw new HomeException with proper message
    public String getAddress() throws HomeException {
        if (address == null) {
            throw new HomeException("Adress is empty");
        }
        return null;
    }

    //Question: If isFinished is not set, what will this method return???
    // what if isFinished will be type of Boolean (object)
    public boolean isFinished() {
        return isFinished;
    }

    public void openDoor() {
        if (hasDoor == null) {
            throw new DoorException("no door yet");
        }
        //throw new DoorException which extends RuntimeException if hasDoor equals false
    }
}
