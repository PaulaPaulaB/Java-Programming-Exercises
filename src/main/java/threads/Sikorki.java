package threads;

/**
 * Run two threads that represents sikorki
 * <p>
 * Make Sikorka class implement interface java.lang.Runnable
 * Every sikorka will 20 times tell its name onto std output in method run
 * After each sound sikorka waits 20 ms before another
 * <p>
 * Start both thread in main thread.
 * After sikorki finish print String "odleciały :("
 * <p>
 * make use of java.lang.Thread class
 */
public class Sikorki {


    public static void main(String[] args) throws InterruptedException {


        Karmnik karmnik = new Karmnik();

        System.out.println("przyleciały sikorki!");
        //start two sikorki giving sound in parallel

        Sikorka sikoreczka1 = new Sikorka("Sikorka Bogatka", karmnik);
        Sikorka sikoreczka2 = new Sikorka("Sikorka Modra", karmnik);
        Paulinka paulinka = new Paulinka(karmnik);

        final Thread sikorka1Thread = new Thread(sikoreczka1);
        final Thread sikorka2Thread = new Thread(sikoreczka2);
        final Thread paulinkaThread = new Thread(paulinka);


        sikorka1Thread.start();
        sikorka2Thread.start();
        paulinkaThread.start();


        try {
            sikorka1Thread.join();
            sikorka2Thread.join();

        } catch (InterruptedException e) {
            System.out.println("Przerwano watek glowny");
        }

        System.out.println("odleciały!");

    }


}
