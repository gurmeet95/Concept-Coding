package collection_learning.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMap_methods {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map=new TreeMap<>();
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");

        System.out.println(map.lowerEntry(23)); //return previous lower key with value.
        System.out.println(map.lowerKey(25)); //return  previous lower key only.
        System.out.println(map.floorEntry(28)); // return equal or lower,in these we can pass any value not required to pass key only.
        System.out.println(map.floorKey(25));
        System.out.println(map.ceilingEntry(28));// equal or greater
        System.out.println(map.ceilingKey(25));
        System.out.println(map.higherEntry(28)); //greater with value.
        System.out.println(map.higherKey(25));
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.pollFirstEntry()); //return and remove first entry.
        System.out.println(map.firstEntry());
        System.out.println(map.pollLastEntry()); //return and remove last entry
        System.out.println(map.lastEntry());
        System.out.println(map.descendingMap());
        System.out.println(map.navigableKeySet());
        System.out.println(map.descendingKeySet());
        System.out.println(map.headMap(23,true)); // true indicate this key also include.
        System.out.println(map.tailMap(23,true)); //true-inclusive


    }
}
