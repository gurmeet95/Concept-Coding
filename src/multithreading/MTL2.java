package multithreading;

public class MTL2 extends Thread{
    @Override
    public void run(){
        System.out.println("Code Executed by Thread: "+Thread.currentThread().getName()+" MTL2");
    };
    //This is also consider as Thread.Because its directly Extends Thread Class.

}
