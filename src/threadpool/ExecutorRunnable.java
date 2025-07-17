package threadpool;

public class ExecutorRunnable implements Runnable{
    @Override
    public void run() {

        System.out.println("Task Processed by "+Thread.currentThread().getName());
        try {
            Thread.sleep(5200);
        } catch (InterruptedException e) {


        }

    }
}
