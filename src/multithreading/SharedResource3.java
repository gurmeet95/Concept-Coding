package multithreading;

public class SharedResource3 {
    boolean isAvailable=false;
    public synchronized void produce(){
        System.out.println("Lock acquired");
        isAvailable=true;
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Locke released");
    }
}
