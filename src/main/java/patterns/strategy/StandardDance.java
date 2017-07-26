package patterns.strategy;

public class StandardDance implements RodzajTancaStrategy {

    @Override
    public void dance() {
        System.out.println("Tańczę walca! itd");
    }
}
