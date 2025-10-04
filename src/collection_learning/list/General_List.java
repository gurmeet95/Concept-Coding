package collection_learning.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//List is ordered collection of an object.Duplicate values can be stored.
//Data can be inserted,removed and access from anywhere.Using indexes.
// Internally list uses Array.
public class General_List {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();

        //add(int index,Element e)
        l1.add(0,12);
        l1.add(1,120);
        l1.add(2,130);
        l1.add(140); // add in last

        l1.forEach((Integer x)-> System.out.print(x+","));
        System.out.println();
        //addAll(int index,Collection c)
        List<Integer> l2=new ArrayList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);

        l1.addAll(2,l2);
        System.out.println("Added L2 into L1 at index two - ");
        l1.forEach((Integer x)-> System.out.print(+x+","));

        //replace all
        l1.replaceAll((Integer x)-> x*2); // Doubles every element.
        System.out.println("After doubles every element - ");
        l1.forEach((Integer x)-> System.out.print(+x+","));

        //Sort(comparator c)
        l1.sort((Integer i1,Integer i2)-> i1-i2); //Asscending order.
        System.out.println();
        System.out.println("After sorting - ");
        l1.forEach((Integer x)-> System.out.print(+x+","));
        System.out.println();

        //get(int index)
        System.out.println("Element at index 2 is "+l1.get(2));

        //set(int index,Element e) it will replace index element with given element.
        l1.set(2,-400);
        System.out.println("List after setting -400 at index two - ");
        l1.forEach((Integer x)-> System.out.print(+x+","));

        //remove(int index)
        l1.remove(2);
        System.out.println("List after removing element from Index 2 - ");
        l1.forEach((Integer x)-> System.out.print(+x+","));

        //indexOf(object 0)
        System.out.println();
        System.out.println("Index of 300 is "+l1.indexOf(600));
        // it returns first occurrence, lastIndexOf return last occurrence, -1 is element is not present in list.











    }
}
