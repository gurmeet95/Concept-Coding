package multithreading;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        SharedResource3 resource = new SharedResource3();
        Thread thread = new Thread(() -> {
            System.out.println("Thread calling Produce Method");
            resource.produce();

        });
        thread.setDaemon(true);
        // Now as soon as Main thread(User Thread) completed it execution,this thread also terminated in between.
        // even if its task is completed or not,and program finished.
        thread.start();

        System.out.println("Main thread completed");
        //Garbage collector is kind of daemon.
        //Autosave.
        //LOGGING.

    }
}
