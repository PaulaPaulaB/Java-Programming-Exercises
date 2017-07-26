package patterns.strategy;

public class LatinDance implements RodzajTancaStrategy {
    @Override
    public void dance() {
        samba();
        chacha();
        rubma();
        jive();
    }

    private void jive() {
        System.out.println("jive");
    }

    private void rubma() {
        System.out.println("rumba!");
    }

    private void chacha() {

        System.out.println("CzaCza!");
    }

    private void samba() {

        System.out.println("samba!");
    }


}
