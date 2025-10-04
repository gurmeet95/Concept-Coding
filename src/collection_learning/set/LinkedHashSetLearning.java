package collection_learning.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Maintains order.

public class LinkedHashSetLearning {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(12);
        set.add(11);
        set.add(33);
        set.add(4);
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
