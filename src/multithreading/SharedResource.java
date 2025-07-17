package multithreading;

public class SharedResource {
    boolean itemAvailable= false;
    //synchronized put the monitor lock.
    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by "+Thread.currentThread().getName()+" and invoking all threads which are waiting ");
        notifyAll();
    }

    public synchronized void consumedItem(){
        System.out.println("ConsumedItem invoked by "+Thread.currentThread().getName());

        //Using while to avoid "spurious wake-up",sometime because of system noise.
        while(!itemAvailable){
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+ " is waiting now");
                wait(); //it releases the monitor lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Item consumed by: "+Thread.currentThread().getName());
        itemAvailable=false;
    }

}
