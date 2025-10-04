package collection_learning.set;

//Collections of object,but does not contain duplicate value(only one "null" value can insert).
//Set is unordered Collection.
// can not be accessed via index.

//Hashset internally uses HashMap.But it stores one value key only, for
// value it internally stores dummy object.
//Not threadSafe. newKeyset method present in ConcurrentHashMap class is used to create threadSafe set.


import java.util.HashSet;
import java.util.Set;

public class General {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.forEach((Integer key)-> System.out.print(key+","));
        Set<Integer> set1 = new HashSet<>();
        set1.add(13);
        set1.add(18);
        set1.add(36);
        set1.add(15);
        System.out.println();
        set1.forEach((Integer key)-> System.out.print(key+","));

        //Union of sets.
        set.addAll(set1);
        System.out.println();
        System.out.println("After Union");
        set.forEach((Integer key)-> System.out.print(key+","));

        //Intersection of 2 sets
        set=new HashSet<>();
        set.add(12);
        set.add(11);
        set.add(33);
        set.add(4);

        set1=new HashSet<>();
        set1.add(11);
        set1.add(9);
        set1.add(88);
        set1.add(12);
        set.retainAll(set1);
        System.out.println();
        System.out.println("After intersection");
        set.forEach((Integer key)-> System.out.print(key+","));

        //Difference of 2 sets.
        set=new HashSet<>();
        set.add(12);
        set.add(11);
        set.add(33);
        set.add(4);
        set1=new HashSet<>();
        set1.add(11);
        set1.add(9);
        set1.add(88);
        set1.add(12);
        set.removeAll(set1);
        System.out.println();
        System.out.println("After Diffrence ");
        set.forEach((Integer key)-> System.out.print(key+","));




    }
}
