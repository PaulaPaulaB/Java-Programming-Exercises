package inheritance;

public interface Dancer {

    void dance();

    default void warmUp() {

        //interface can have default methods
        System.out.println("Warming up!");

        this.dance();
        // we can see that default method can have access to this
    }

    static void interfaceCanHaveStaticMethods() {

        System.out.println("Cannot have access to this because of static nature");

    }


}
