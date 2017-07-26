package anonymous;

public class WashMachine {

    public void wash(Cloth cloth) {
        System.out.println(cloth.getWashInfo());
        System.out.println("Washing");
    }

    public void dry (Cloth cloth){
        System.out.println(cloth.getDryingInfo());
        System.out.println("Drying");
    }

}
