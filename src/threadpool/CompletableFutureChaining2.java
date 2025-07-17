package threadpool;

import java.util.concurrent.*;

public class CompletableFutureChaining2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(4));
        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
            try{
                System.out.println("Thread Name of SupplyAsync: "+Thread.currentThread().getName());
                Thread.sleep(5000);
            }catch(Exception e){}
            return "Concept ";
        },executor);

        CompletableFuture<String> completableFuture2=completableFuture.thenApply((String value)->{
            try{
                System.out.println("Thread Name of thenApply: "+Thread.currentThread().getName());
                Thread.sleep(3000);
            }catch(Exception e){}
            //thenApply is synchronous use same thread as supplyAsync.
            return value+"and ";



        }).thenApplyAsync((String val)->{
            System.out.println("Thread Name of thenApply: "+Thread.currentThread().getName());
            return val+"Coding";
            //thenApplyAsync use different thread and no guarantee of order.

        });
        try {
            String result=completableFuture2.get();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();

    }
}
