package threadpool;

import java.util.concurrent.*;

public class ThenComposeAndAsync {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5));
        CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
            return "Hello";
        },executor);
        CompletableFuture<String> future1=future.thenCompose((String val)->{
            return CompletableFuture.supplyAsync(()-> val+ " World");
        }).thenComposeAsync((String val)->{
            return CompletableFuture.supplyAsync(()-> val+ " Java");
        });
        try {
            System.out.println(future1.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();

    }
    //Compose guarantee the order of execution.
    //thenAccept and thenAcceptAsync generally use at the end of the chain, it does not return anything.

}
