package multithreading;

public class MTL1_2Main {
    public static void main(String[] args) {
        System.out.println("Going in Main Thread "+Thread.currentThread().getName());
        MTL1 t1=new MTL1();
        Thread thread=new Thread(t1);
        thread.start();
        System.out.println("Main Thread completed "+Thread.currentThread().getName());

        //MTL2
        MTL2 thread1=new MTL2();
        // Thread thread=new Thread(t1); no need of Thread object because MTL2 is extending Thread,and become Thread class itself.
        thread1.start();

    }
}
