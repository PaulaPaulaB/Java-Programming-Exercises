package patterns.decorator;

import org.junit.Test;

public class DekoratorTest {


    @Test
    public void dekoratorTest() {

        Zupa zupaOgorkowa = new ZiemniakiDekorator(new SolenieDekorator(new ZupaOgorkowa()));
        zupaOgorkowa.gotuj();

        Zupa pomidorowa = new SolenieDekorator(new ZupaPomidorowa());
        zupaOgorkowa.gotuj();


    }
}
