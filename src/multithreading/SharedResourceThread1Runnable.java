package multithreading;

public class SharedResourceThread1Runnable implements Runnable{
    SharedResource sharedResourceobj;
    SharedResourceThread1Runnable(SharedResource sharedResourceobj){
        this.sharedResourceobj=sharedResourceobj;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResourceobj.addItem();

    }
}
