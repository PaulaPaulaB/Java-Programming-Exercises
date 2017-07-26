package patterns.decorator;


public class SolenieDekorator extends DekoratorZupy {


    SolenieDekorator(Zupa zupa) {
        super(zupa);
    }

    @Override
    public void gotuj() {
        solenie();
        dekorowanaZupa.gotuj();
    }

    private void solenie() {
        System.out.println("Solę zupę!");
    }
}
