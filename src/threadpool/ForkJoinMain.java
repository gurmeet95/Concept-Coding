package threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class ForkJoinMain {
    public static void main(String[] args) {
        ForkJoinPool pool=ForkJoinPool.commonPool();
        Future<Integer> future= pool.submit(new ComputeSumTask(0,100));

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

    }

