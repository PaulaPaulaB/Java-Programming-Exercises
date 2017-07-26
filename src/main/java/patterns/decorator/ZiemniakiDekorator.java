package patterns.decorator;

public class ZiemniakiDekorator extends DekoratorZupy {


    ZiemniakiDekorator(Zupa zupa) {
        super(zupa);
    }

    @Override
    public void gotuj() {
        dodajZiemniory();
        dekorowanaZupa.gotuj();
    }

    private void dodajZiemniory() {
        System.out.println("Dodaję ziemniory!");
    }
}
