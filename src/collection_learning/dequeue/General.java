package collection_learning.dequeue;

//Deque stands for double Ended queue.Means addition and removal can be done from
// both sides of the queue.
// insertOperations - addFirst(),offerFirst();addLast();offerLast()
//deletion- removeFirst(),pollFirst();removeLast();pollLast()
//Examine- getFirst(),peekFirst(),getLast();peekLast();

//To use it as stack push() and pop() also available, internally these use push() -addFirst() and  pop()-removeFirst()
//Queue methods works with same behaviour.
// we can implement dequeue as Stack also LIFO.

//ArrayDeque- Concrete class, implements the methods which are available in queue and deque.
//Not thread safe.
//ConcurrentLinkedDeque is ThreadSafe version.
import java.util.ArrayDeque;

public class General {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        //insertion
        arrayDeque.addLast(1);
        arrayDeque.addLast(23);
        arrayDeque.addLast(10);
        for(Integer el:arrayDeque){
            System.out.print(el+",");

        }
        System.out.println();

        //deletion
        int element=arrayDeque.removeFirst();
        System.out.println("Removed element:"+element);


        //LIFo(last in first out)
        ArrayDeque<Integer> lifo=new ArrayDeque<>();
        //insertion
        lifo.addFirst(14);
        lifo.addFirst(143);
        lifo.addFirst(93);
        for(Integer e:lifo){
            System.out.print(e+",");
        }
        System.out.println();
        //deletion
        int removeElement=lifo.removeFirst();
        System.out.println("Removed element: "+removeElement);

    //Insertion:Mostly O(1), O(n)- when size is full and resize happens.
    // Deletion and Search:  o(1)
    //space complexity: O(n)



    }
}
