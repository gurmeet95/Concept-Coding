package multithreading;

public class SharedResource2ProducerThread implements Runnable{
    private SharedResource2 sharedBuffer;
    public SharedResource2ProducerThread(SharedResource2 sharedBuffer){
        this.sharedBuffer=sharedBuffer;
    }



    @Override
    public void run() {
        for(int i=1;i<=6;i++){
            try {
                sharedBuffer.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
