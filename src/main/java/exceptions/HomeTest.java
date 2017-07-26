package exceptions;

import org.junit.Test;

public class HomeTest {

    //create home without furniture and expect exception after invoking getFurniture method
    @Test
    public void furnitureTest() {
        Home home = new Home();
        try {
            home.getAddress();
            home.getFurniture();
        } catch (NoFurnitureException e) {
            System.out.println(e.toString());
        } catch (HomeException e) {
            System.out.println(e.toString());
        }

        try {
            home.openDoor();
        } catch (DoorException e) {
            System.out.println(e.toString());
        }
    }
}
