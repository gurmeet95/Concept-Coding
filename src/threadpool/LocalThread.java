package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LocalThread {
    public static void main(String[] args) {
        ThreadLocal<String> localObj = new ThreadLocal<>();

        // mainThread
        localObj.set((Thread.currentThread().getName()));
        Thread th1 = new Thread(() -> {
            localObj.set((Thread.currentThread().getName()));
            System.out.println("Task 1");
        });
        th1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        //here we have main method.
        System.out.println("Main Thread: "+localObj.get());


        System.out.println("************************************************");
        //Remember to clean up,if reusing the thread.
        ThreadLocal<String> cleanupLocalThread=new ThreadLocal<>();
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        executorService.submit(()->{
            cleanupLocalThread.set(Thread.currentThread().getName());
            cleanupLocalThread.remove();
        });
        for(int i=0;i<15;i++){
            executorService.submit(()->{
                System.out.println(cleanupLocalThread.get());
                //generally for thread cleanupLocalThread.get() is null.
                // but for one its shows pool-1-thread-1 because in line 30 we set local thread
                // but haven't clear it after task completion so that one thread is still set there.
                // cleanupLocalThread.remove() this clean it up.
                // now after cleaning up in line 31 every thread local is null.
            });
        }


    }
}
