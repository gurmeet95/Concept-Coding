package multithreading;

public class SemaphoreMain {
    public static void main(String[] args) {
        SemaphoreResource resource=new SemaphoreResource();
        Thread thread1=new Thread(()->{
            resource.produce();
        });
        Thread thread2=new Thread(()->{
            resource.produce();
        });
        Thread thread3=new Thread(()->{
            resource.produce();
        });
        Thread thread4=new Thread(()->{
            resource.produce();
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        //await()==wait()
        //signal()==notify()
        //signalAll()==notifyAll()

    }
}
