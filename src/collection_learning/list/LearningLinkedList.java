package collection_learning.list;

import java.util.LinkedList;

//Collection name is LinkedList, Data Structure used is also LinkedList.
//LinkedList implement both Deque and List Interface.
public class LearningLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();

        //using deque functionality.
        list.addLast(14);
        list.addLast(18);
        list.addLast(34);
        list.addLast(143);
        list.addFirst(78);
        System.out.println(list.getFirst());


        //Using list Functionality.
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(0,100);
        l2.add(1,10);
        l2.add(2,46);
        l2.add(3,54);
        System.out.println(l2.get(1)+","+ l2.get(3));






    }
}
//Time Complexity: Faster than ArrayList.
// Insertion at start and end- O(1)
//Insertion at particular Index : o(n)
// search o(n)
//Deletion at start or end: O(1)
//Deletion at Specific index: o(N)

//Space Complexity: O(N)
// Not thread safe, Vector is thread safe version.

// Stack: Represent LIFO, Since its extends vector,its also thread safe.its methods is synchronized.
