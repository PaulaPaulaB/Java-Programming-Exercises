package patterns.strategy;

import org.junit.Test;
import patterns.singleton.Singleton;

public class TreningTanecznyTest {


    @Test
    public void strategyTest() {

        TreningTaneczny standard = new TreningTaneczny(new StandardDance());
        standard.letsDance();


        TreningTaneczny lacina = new TreningTaneczny(new LatinDance());
        lacina.letsDance();

    }

}
