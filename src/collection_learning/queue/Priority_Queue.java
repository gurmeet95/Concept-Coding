package collection_learning.queue;

// Queue is an interface,Child of collection Interface
// Follows FIFO, but exceptions are there Priority Queue.
// Support all method of collection + some other own methods.
// if we are solving any ds question using heap then we have to use Priority queue.

//add(),offer(),poll()-return and remove,peek()-return ,remove()- retrieves and remove,element()-retrieve only;
// not thread safe.
//PriorityBlockingQueue is thread safe version.
import java.util.PriorityQueue;

public class Priority_Queue<I extends Number> {
    // Priority queue is of two type - Minimum and Maximum.
    //it is based on priority heap(min heap and max heap)

    public static void main(String[] args) {

        //min priority queue, used to solve problems of min heap.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // min priority que minimum at first.
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.forEach((Integer x)-> System.out.print(x+" "));
        System.out.println();

        while (!pq.isEmpty()){
            System.out.println("Remove from top "+pq.poll());
        }


        PriorityQueue<Integer> maxPQ=new PriorityQueue<>((Integer a,Integer b)-> b-a);
        //Comparator- (Integer a,Integer b)-> b-a , now this is queue is using max heap hence it is max pq.
        maxPQ.offer(5);
        maxPQ.offer(2);
        maxPQ.offer(8);
        maxPQ.offer(1);

        maxPQ.forEach((Integer x)-> System.out.print(x+" "));
        System.out.println();

        while (!maxPQ.isEmpty()){
            System.out.println("Remove from top "+maxPQ.poll());
        }

//TimeComplexity:
        //Add and Offer: O(logn)
        //Poll and Remove: O(logn)
        // peek:O(1)
        //Remove:O(n)




    }
}
