package future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Ujezdzalnia {

    public static void main(String[] arg) throws ExecutionException, InterruptedException {
        ExecutorService dostepneKonie = Executors.newFixedThreadPool(10);
        JazdaKonna jazdaKonna = new JazdaKonna(450);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Future<String> future = dostepneKonie.submit(jazdaKonna);
            futures.add(future);
        }

        futures.forEach(future -> {
            try {
                if (future.isDone()) {
                    System.out.println("is Done");
                } else {
                    System.out.println("waiting...");
                }
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });


    }
}
