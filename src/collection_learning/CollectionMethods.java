package collection_learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Collection is interface in java that provides all methods to work with collections.
// provide common methods to work for all different collections list,stack etc
public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
        list.add(20);
        System.out.println(list.contains(20));
        // remove using index.
        list.remove(3);
        System.out.println(list.contains(20));
        // remove using object, removes the first occurrence of the value.
        list.remove(Integer.valueOf(3));
        System.out.println(list.contains(3));

        //stack
        Stack<Integer> stack=new Stack<>();
        stack.add(4);
        stack.add(5);
        stack.add(6);
        list.addAll(stack);
        System.out.println("Lets check stack now");
        System.out.println( list.containsAll(stack));
        list.remove(Integer.valueOf(6));
        System.out.println( "Six removed "+list.containsAll(stack));
        list.removeAll(stack);
        System.out.println("remove all "+ list.contains(5));
        list.clear();
        System.out.println("Clear "+list.isEmpty());





    }
}

//Collection vs Collections
// Collection is interface, its a part of Java collection framework,it provides
// various methods which implemented by various collection classes like arraylist,stack,linkelist etc.

//Collections is a utility class(all static method) and provide static methods,which is uses to operate on
// collections like sorting,swaping,searching,reverse,copy etc.
