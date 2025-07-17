package threadpool;

import java.util.concurrent.*;

public class TP2 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(1,1,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
            Future<?> futureObj=poolExecutor.submit(()->{
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("This is the thread which Thread Pool Will Execute.");

             });
//             poolExecutor.shutdown();
             //Checking the status of thread.
              System.out.println("is Done: "+futureObj.isDone());

        try {
            futureObj.get(2,TimeUnit.SECONDS);
        }
         catch (TimeoutException e) {
             System.out.println("Time out Exception Happened");
        }catch (Exception e){

        }
        try {
            futureObj.get();
        } catch (Exception e) {

        }
        System.out.println("is Done: "+futureObj.isDone());
        System.out.println("is Canceled: "+futureObj.isCancelled());
        poolExecutor.shutdown();

    }
    // main thread will continue processing.
    // now what if caller want to know the status of thread1,weather is completed or failed etc.
    // Here Future come in the picture.// Return type of submit() is future.
    //now with the help of Future<?> futureObj we can check the status of thread1.
}
