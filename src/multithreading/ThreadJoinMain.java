package multithreading;

public class ThreadJoinMain {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        SharedResource3 resource=new SharedResource3();
        Thread thread=new Thread(()->{
            System.out.println("Thread1 Started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.produce();
            System.out.println("Thread1 Finished");
        });
        thread.start();
        try {
            System.out.println("Main thread is now waiting for Thread1 to finish its task.");
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread completed");


    }
    // whatever thread we created till now is User Thread.
    //thread.setPriority()
    // 1-> Low Priority 10-> High Priority  5-> Norm Priority
    // thread.setPriority(Thread.MAX_PRIORITY);
    //Set thread priority also  not guarantee that which thread execute first.
    //Never relay on thread priority.

    //Daemon Thread - Daemon means something which running in Asynchronous method.
    // thread.setDaemon(true) -> Only after this a thread is considered as Daemon thread.
    // Daemon thread is alive till any one usr thread is alive.

}
