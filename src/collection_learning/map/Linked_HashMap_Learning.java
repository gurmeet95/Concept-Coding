package collection_learning.map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Helps in maintain insertion order/access order(less frequently use to high frequently use).
//Similar to hashmap,but also uses Double LinkedList.
//it has after and before pointer.
public class Linked_HashMap_Learning {

    public static void main(String[] args) {
        System.out.println("****** Below is example of LinkedHashMap *****");


        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");
        map.forEach((Integer key,String value)-> System.out.println(key+":"+value));
        // order is guaranteed - insertion order.

        System.out.println("Normal Hashmap Execution-Order is not garanted");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(21,"B");
        map1.put(23,"C");
        map1.put(141,"D");
        map1.put(25,"E");
        for(Map.Entry<Integer,String> entry:map1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //LinkedHashmap with Access order.
        Map<Integer,String> map2=new LinkedHashMap<>(16,.75F,true);
        map2.put(1,"A");
        map2.put(21,"B");
        map2.put(23,"C");
        map2.put(141,"D");
        map2.put(25,"E");

        map2.get(23); // we access this now it will move to back, less frequent access to more frequent access.
        map2.forEach((Integer key,String value)-> System.out.println(key+":"+value));

    }
}

//Time Complexity
//Amortized: O(1)
// Its not thread safe and there is no thread safe version available,we have to manually make thread safe.
// Map<Integer,String>map2 = Collections.synchronizedMap(new LinkedHashMap<>());
