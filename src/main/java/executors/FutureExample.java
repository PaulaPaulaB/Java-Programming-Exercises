package executors;

import java.util.concurrent.*;

public class FutureExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

        Integer result = null;

        //waits until result is available
        //Integer result = future.get();
        try {
            future.get(1, TimeUnit.SECONDS);//waits only one second
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + future.get());
        System.out.print("result: " + future.isDone());
    }


}
