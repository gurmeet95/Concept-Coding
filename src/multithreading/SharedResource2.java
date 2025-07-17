package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource2 {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;
    public SharedResource2(int bufferSize){
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }
    public synchronized void produce(int item) throws InterruptedException {
        //If Buffer is full, wait for the consumer to consume items.
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Please wait Consumer is consuming the items.");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+item);
        //Notify the consumer that there are item to consume now.
        notify();
    }
    public synchronized int consume() throws InterruptedException {
        //Buffer is empty wait for the produce to produce the item.
        while (sharedBuffer.isEmpty()){
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumed: "+item);
        //Notify the produce that there is space in buffer now.
        notify();
        return item;

    }



}
