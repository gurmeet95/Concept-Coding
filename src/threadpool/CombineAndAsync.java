package threadpool;

import java.util.concurrent.*;

public class CombineAndAsync {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5));
        CompletableFuture<String> future1=CompletableFuture.supplyAsync(()->{
            return "Hello";
        },executor);
        CompletableFuture<Integer> future2=CompletableFuture.supplyAsync(()->{
            return  10;
        },executor);
        CompletableFuture<String> combineResult=future1.thenCombine(future2,(String val,Integer z)-> val+z);
        try {
            System.out.println(combineResult.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
