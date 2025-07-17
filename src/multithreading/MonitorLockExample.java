package multithreading;

public class MonitorLockExample {
    public synchronized void task1(){
        // do something

        try {
            System.out.println("Inside Task1 ");
            Thread.sleep(10000);
            System.out.println("Task1 completed ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void task2(){
        System.out.println(" task2, before Synchronized");
        synchronized (this){
            System.out.println("Task2, Inside Sychronized");
        }

    }
    public void task3(){
        System.out.println("Inside task3 ");
    }




}
