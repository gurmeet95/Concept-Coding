package collection_learning;

// Collections is nothing but a group of object.
//Present in java.util package

// Iterable is interface,used to traverse the collections.
//Collection is interface in java that provides all methods to work with collections.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        //Using iterator
        System.out.println("Iterating the values using iterator method.");
        Iterator<Integer> iterator= l1.iterator();  //return true if collection has more element.
        while(iterator.hasNext()){
            int val= iterator.next(); // return next element in collection.
            System.out.println(val);
            if(val==20){
                iterator.remove(); //remove last return element. remove 20.
            }

        }

        //for each loop
        System.out.println("Iterating the values using enhanced for-each loop");
        for(int val:l1){
            System.out.println(val);
        }

        //for each method.
        System.out.println("Using for each method");
        l1.forEach((Integer val)-> System.out.println(val));

        // all the collection can be iterate via these methods which extends/implements  Iterable interface.


    }
}
