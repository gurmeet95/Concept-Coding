package multithreading;

public class MainStampedOptimistic {
    public static void main(String[] args) {


        StampedOptimistic resource = new StampedOptimistic();
        Thread thread1 = new Thread(() -> {
            resource.producer();
        });
        Thread thread2 = new Thread(() -> {
            resource.consumer();
        });
        thread1.start();
        thread2.start(); // If this thread  does not start,Value of a will update because
        // at the time of validation there is no change in stamp.


    }
}