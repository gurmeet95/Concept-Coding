package multithreading;

public class SharedResourceMain {
    public static void main(String[] args) {
        SharedResource sharedResourceobj=new SharedResource();
//        Thread producerThread=new Thread(()->{
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            sharedResourceobj.addItem();
//        }); this is lambda method we can also do it like this.
        SharedResourceThread1Runnable sharedResourceThread1Runnable= new SharedResourceThread1Runnable(sharedResourceobj);
        Thread producerThread= new Thread(sharedResourceThread1Runnable);
        Thread consumeThread=new Thread(()->{
            sharedResourceobj.consumedItem();
        });
        producerThread.start();
        consumeThread.start();
    }
}
