package collection_learning.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_methods {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<>();
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");
        map.forEach((Integer key,String value)-> System.out.println(key+":"+value));
        System.out.println(map.headMap(23)); //23 exclusive
        System.out.println(map.tailMap(23)); //23 inclusive
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
