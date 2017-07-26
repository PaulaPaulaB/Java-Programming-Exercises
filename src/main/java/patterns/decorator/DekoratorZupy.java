package patterns.decorator;


public abstract class DekoratorZupy implements Zupa {


    protected final Zupa dekorowanaZupa;

    public DekoratorZupy(Zupa zupa) {
        this.dekorowanaZupa = zupa;
    }

}
