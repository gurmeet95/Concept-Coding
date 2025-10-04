package collection_learning.map;

//default initial size=16;
//default load factor =0.75
//double the size
//TERIFY_THRESHOLD- 8 - when 8 collisions happens or 8 key,value are there at
// particular index it will convert that LinkedList into balance binary tree.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Learning {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(null,"Test");
        map.put(0,null);
        map.put(1,"A");
        map.put(2,"B");

        //compute if present.
        map.putIfAbsent(null,"test"); // not put because value is already there for null.
        map.putIfAbsent(0,"ZERO"); // put because value is null there.
        map.putIfAbsent(3,"C"); // put because key is not there

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            Integer key= entry.getKey();
            String value= entry.getValue();
            System.out.println("Key:"+key+", Value:"+value);
        }
        System.out.println("isEmpty(): "+map.isEmpty());
        System.out.println("size(): "+map.size());
        System.out.println("ContainsKey(3): "+ map.containsKey(3));
        System.out.println("get(1): "+ map.get(1));
        //getOrDefault(key)
        System.out.println("get(9): "+map.getOrDefault(9,"default value"));
        System.out.println("remove(null): "+map.remove(null));

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            Integer key= entry.getKey();
            String value= entry.getValue();
            System.out.println("Key:"+key+", Value:"+value);
        }

        //keySet()
        for(Integer key:map.keySet()){
            System.out.println(key+",");
        }

        //values()
        Collection<String> values=map.values();
        for(String val:values){
            System.out.println(val+",");
        }







    }

}

// Average time complexity- O(1) - amortized(average)
// Worst - For LinkedList O(N) but if it reached threshold then
// for Binary Search tree- O(log n)
