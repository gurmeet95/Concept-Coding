package multithreading;

import java.sql.SQLOutput;
import java.util.concurrent.Semaphore;

public class SemaphoreResource {
    boolean isAvailable=false;
    Semaphore lock=new Semaphore(2);
    public  void produce(){

        try {
            lock.acquire();
            System.out.println("Lock Acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.release();

        }


    }
}
