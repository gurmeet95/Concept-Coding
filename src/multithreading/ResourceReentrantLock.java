package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ResourceReentrantLock {
    boolean isAvailable=false;

    public void produce(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(3000);



        }catch (Exception e){

        }finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.unlock();


        }
    }
}
