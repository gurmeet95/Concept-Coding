package threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableRunnable {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(3,3,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy() );
        //UseCase1 Runnable
        Future<?> futureObject=executor.submit(()->{
            System.out.println("Task 1 with Runnable.");
        });
        try {
            Object object=futureObject.get();
            System.out.println(object==null);
        } catch (Exception e) {}

        //UseCase2 Runnable with Return.
        List<Integer> output=new ArrayList<>();
        Future<List<Integer>> futureObject2=executor.submit(()->{
            output.add(300);
            System.out.println("Task2 with runnable and return object.");

        },output);
        try {
            List<Integer> outputFutureObject2= futureObject2.get();
            System.out.println(outputFutureObject2.get(0));
        } catch (Exception e) {
        }


        //UseCase3 Callable.
        //List<Integer> output2=new ArrayList<>();
        Future<List<Integer>> callableFuture=executor.submit(()->{
            List<Integer> output2=new ArrayList<>();
            output2.add(200);
            return output2;
        });
        try {
            List<Integer> outputCallableFuture= callableFuture.get();
            System.out.println(outputCallableFuture.get(0));
        } catch (Exception e) {
        }


    }
}
