package patterns.strategy;

public class TreningTaneczny {

    private final RodzajTancaStrategy danceStrategy;

    public TreningTaneczny(RodzajTancaStrategy danceStrategy) {
        this.danceStrategy = danceStrategy;
    }

    public void letsDance() {
        przebraniesie();
        rozgrzewka();
        danceStrategy.dance();
        dodomu();
    }

    private void dodomu() {
        System.out.println("Autobusem do domu");
    }

    private void rozgrzewka() {
        System.out.println("Pajacyki!");
    }

    private void przebraniesie() {
        System.out.println("Przebieram sie");
    }
}
