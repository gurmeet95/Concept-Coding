package multithreading;

public class MonitorLockThread1Runnable implements Runnable {
    MonitorLockExample obj;
    MonitorLockThread1Runnable(MonitorLockExample obj){
        this.obj=obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
