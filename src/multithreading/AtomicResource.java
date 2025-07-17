package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicResource {

    AtomicInteger count=new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    public int getCount(){
        return count.get();
    }
}
