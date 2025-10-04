package collection_learning;

//Collection vs Collections
// Collection is interface, its a part of Java collection framework,it provides
// various methods which implemented by various collection classes like arraylist,stack,linkelist etc.

//Collections is a utility class(all static method) and provide static methods,which is uses to operate on
// collections like sorting,swaping,searching,reverse,copy etc.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVSCollections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(); //Collection
        list.add(7);
        list.add(3);
        list.add(77);
        list.add(41);

        System.out.println("Max "+ Collections.max(list));
        System.out.println("Min "+ Collections.min(list));
        Collections.sort(list);
        System.out.println("Sorted");
        list.forEach((Integer val)-> System.out.print(val+" "));

    }
}
