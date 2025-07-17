package multithreading;

public class MainSharedResource2 {
    public static void main(String[] args) {
        SharedResource2 sharedBuffer=new SharedResource2(3);
        SharedResource2ProducerThread producerThread=new SharedResource2ProducerThread(sharedBuffer);
        Thread producer=new Thread(producerThread);
        Thread ConsumerThread =new Thread(()->
        {

                try {
                    for(int i=1;i<=6;i++) {
                        sharedBuffer.consume();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        });
        producer.start();
        ConsumerThread.start();


    }
}
