package multithreading;

public class MTL1 implements Runnable {
    //This class is not a Thread class because its implementing Runnable not extends Thread.
    @Override
    public void run() {
        System.out.println("Code executed by thread: "+Thread.currentThread().getName());
    }
    // This is preferable then Extend Thread.
}
