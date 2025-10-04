package collection_learning.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLearning {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(12);
        set.add(11);
        set.add(33);
        set.add(4);
        set.forEach((Integer val)-> System.out.print(val+","));

        //Descending order
        Set<Integer> set1=new TreeSet<>((Integer val1,Integer val2)-> val2-val1);
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);
        System.out.println();
        set1.forEach((Integer val)-> System.out.print(val+","));
    }
}
