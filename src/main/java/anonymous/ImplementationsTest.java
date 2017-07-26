package anonymous;

import org.junit.Test;

public class ImplementationsTest {


    @Test
    public void implementationTest() {
        WashMachine washMachine = new WashMachine();
        final Wardrobe wardrobe = new Wardrobe();
        final Cloth zaraPants = wardrobe.getCloth("Zara");
        washMachine.wash(zaraPants);
        washMachine.dry(zaraPants);
    }

    @Test
    public void anonymousTest() {
        final WashMachine washMachine = new WashMachine();
        washMachine.wash(new Cloth() {
            @Override
            public String getWashInfo() {
                return "400";
            }

            @Override
            public String getDryingInfo() {
                return "4";
            }
        });
    }
}
