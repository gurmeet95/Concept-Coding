package threadpool;

import java.util.concurrent.*;

public class CompletableFutureOperation {
    public static void main(String[] args) {
        ThreadPoolExecutor executor= new ThreadPoolExecutor(2,4,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1=CompletableFuture.supplyAsync(()->{
            return "Task Completed";
        },executor);
        try {
            System.out.println("Result: "+asyncTask1.get());
        } catch (Exception e) {}
        CompletableFuture<String> asyncTask2=CompletableFuture.supplyAsync(()->{
            // Task which thread need to complete.
            return "Concept and ";
        },executor).thenApply((String val)->{
            //functionality which can work on result of previous async task.
            // This is chaining.
              return val+"Coding";
        });
        try {
            String result1= asyncTask2.get();
            System.out.println("Result: "+result1);
        } catch (Exception e) {}

    }
}
