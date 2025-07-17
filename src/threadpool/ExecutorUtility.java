package threadpool;

import java.util.concurrent.*;

public class ExecutorUtility {
    public static void main(String[] args) {
//        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,10, TimeUnit.MINUTES,
//               new ArrayBlockingQueue<>(5));
        //This is Custom Thread Pool Executor.

        //Executors provides Factory methods which we can use to create Thread Pool Executor.

        //fixed thread pool executor
        // Min and max pool same.

        ExecutorService service= Executors.newFixedThreadPool(5);
        service.submit(()->{
            System.out.println("I am from Fixed thread Pool");
        });

        //cached ThreadPool Executor.
        // Create a new thread as Needed(Dynamically).
        //max= Integer.MAX_VALUE;
        ExecutorService service1= Executors.newCachedThreadPool();
        service1.submit(()->{
            System.out.println("I am from Cached thread Pool");
        });

        //newSingleThreadExecutor -  min,max -1

        //WorkStealing Pool Executor.


    }
}
