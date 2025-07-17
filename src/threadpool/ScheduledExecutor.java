package threadpool;

import java.util.concurrent.*;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService pool= Executors.newScheduledThreadPool(5);
        pool.schedule(()->{
            System.out.println("Hello");
        },5, TimeUnit.SECONDS);
       Future<String> call1= pool.schedule(()->{
            return "Callable";
        },7, TimeUnit.SECONDS);
        try {
            System.out.println(call1.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       Future<?> cancel= pool.scheduleAtFixedRate(()->{
            System.out.println("Thread picked the task");
           try {
               Thread.sleep(6000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("Thread complete the task");
       },3,2,TimeUnit.SECONDS);
        //it keeps on running,so we have to cancel it.
        // Store it in future and cancel then.
        //Second task only start executing once first is completed.
        try{
            Thread.sleep(10000);
            cancel.cancel(true);

        }catch(Exception e){}
        //pool.scheduleWithFixedDelay(()->{
        // once the firs task is completed only then timer will start.
        // All syntex are same as fixed rate.
        // })



        //pool.shutdown();


    }
}
