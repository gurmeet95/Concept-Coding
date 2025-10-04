package collection_learning.queue;

import java.util.Arrays;

//Comparator is functional interface. - int compare(T obj1,T obj2)
public class Comparato_R {
    public static void main(String[] args) {
      Integer[] arr={17,3,5,1,10};
        Arrays.sort(arr,(Integer v1,Integer v2)-> v1-v2);
        // v2-v1 sort it in descending order.
        //Arrays.sort(arr); // this uses compareTo method which is available in Comparable. int compareTo(T obj2);
        // These both sort are same.
        // Comparator help to check weather element need to swap or not,for sorting algorithm is already there.
     for(int a:arr){
         System.out.print(a+",");
     }
    }
}
