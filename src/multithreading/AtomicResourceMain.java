package multithreading;

public class AtomicResourceMain {
    public static void main(String[] args) {
        AtomicResource a1=new AtomicResource();

       Thread thread1=new Thread(()->{
           for(int i=0;i<200;i++){
               a1.increment();
           }
       });
        Thread thread2=new Thread(()->{
            for(int i=0;i<200;i++){
                a1.increment();
            }
        });
        Thread thread3=new Thread(()->{
            for(int i=0;i<200;i++){
                a1.increment();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(Exception e){

        }
        System.out.println(a1.getCount());

    }
}
