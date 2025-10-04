package collection_learning.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearningListIterator {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 12);
        l1.add(1, 120);
        l1.add(2, 130);
        l1.add(140);

        ListIterator<Integer> iterator= l1.listIterator();
        while (iterator.hasNext()){
            int val=iterator.next();
            System.out.println("Traversing Forward:"+val+" Next Index:"+iterator.nextIndex()+" Previous Index: "+iterator.previousIndex());
        if(val== 120){
            iterator.add(150);
        }
        }
        System.out.println("after adding one more value with forward travers:");
        l1.forEach((Integer x)-> System.out.print(x+","));

        //backwardTravers
        ListIterator<Integer> iterator1= l1.listIterator(l1.size());
        System.out.println();
        // need to provide the index in iterator from where it has to start.

        while (iterator1.hasPrevious()){
            int prevVal=iterator1.previous();
            System.out.println("Traversing BackWard:"+prevVal+" Next Index:"+iterator1.nextIndex()+" Previous Index: "+iterator1.previousIndex());
            if(prevVal==140){
                iterator1.set(1200);
            }

        }
        l1.forEach((Integer x)-> System.out.print(x+","));

    }
}

//Time Complexity List:
//Insertion:
//O(1) when inserting at end(Space available).
//o(n) when inserting at particular index and at last when size is full.

//Deletion o(n)

//Search- O(1)

//space Complexity: O(N)

