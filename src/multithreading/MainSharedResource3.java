package multithreading;

public class MainSharedResource3 {
    public static void main(String[] args) {
        SharedResource3 resource=new SharedResource3();
        System.out.println("Main Thread started ");
        Thread thread1=new Thread(()->{
            System.out.println("Thread1 calling produce method.");
            resource.produce();
        });
        Thread thread2=new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread2 calling produce method");
            resource.produce();
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread1 is suspended");
        thread1.suspend(); // now thread 2 will never acquire lock,because thread1 had not released lock and got suspended.
        //This is deadlock.And program will never stop.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread1 resumed.");
        thread1.resume(); // It resumed thread1 and then thread1 will release lock which will acquire by thread2 later.

        System.out.println("Main thread finished its work.");

        //Resume work to activate suspended thread.
    }
}
