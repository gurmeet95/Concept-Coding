package collection_learning.map;

//Maps-SortedMap-NavigableMap-Implements-TreeMap(Concuret class)
//Map is sorted according to natural order of its key(or be Comparator Provided)
//Its based on Red black tree-(Self balancing Binary Search tree).
//O(log n) for  insert,remove,get operation,amortized


import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Learning {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>((Integer key1,Integer key2)->key2-key1);
        //Descending order.
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");
        map.forEach((Integer key,String value)-> System.out.println(key+":"+value));

        System.out.println("********************************");
        Map<Integer,String> map1=new TreeMap<>(); //Natural order i.e Asscending.
        map1.put(1,"A");
        map1.put(21,"B");
        map1.put(23,"C");
        map1.put(141,"D");
        map1.put(25,"E");
        map1.forEach((Integer key,String value)-> System.out.println(key+":"+value));



    }
}
