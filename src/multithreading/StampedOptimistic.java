package multithreading;

import java.util.concurrent.locks.StampedLock;

public class StampedOptimistic {
    int a=10;
    StampedLock lock=new StampedLock();
    public void producer(){
        long stamp=lock.tryOptimisticRead();
        try{
            System.out.println("Taken Optimistic Read.");
            a=11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Updated a value Successfully");
            }else{
                System.out.println("Roll back of work");
                a=10; //rollback
            }

        }catch(Exception e){

        }
    }
    public void consumer() {
        long stamp = lock.writeLock();
        System.out.println("Write lock Acquired by: " + Thread.currentThread().getName());
        try {
            System.out.println("Performing work");
            a=9;
        } finally {
            lock.unlock(stamp);
            System.out.println("Write lock Released by:  "+Thread.currentThread().getName());
        }
    }
}
