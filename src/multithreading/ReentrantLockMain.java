package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        ResourceReentrantLock resource1= new ResourceReentrantLock();

        Thread thread1=new Thread(()->{
            resource1.produce(lock);

        });
        ResourceReentrantLock resource2= new ResourceReentrantLock();
        Thread thread2=new Thread(()->{
            resource2.produce(lock);

        });
        thread1.start();
        thread2.start();
    }
}
