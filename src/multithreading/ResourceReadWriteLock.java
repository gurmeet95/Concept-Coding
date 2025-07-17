package multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceReadWriteLock {
    boolean isAvailable=false;

    public void produce(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read Lock Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(8000);



        }catch (Exception e){

        }finally {
            System.out.println("Read Lock released by: "+Thread.currentThread().getName());
            lock.readLock().unlock();


        }
    }
    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock Acquired by: "+Thread.currentThread().getName());
            isAvailable=false;
        } catch(Exception e){


        }finally {
            System.out.println("Write Lock Released  by: "+Thread.currentThread().getName());
            lock.writeLock().unlock();

        }
    }

}
