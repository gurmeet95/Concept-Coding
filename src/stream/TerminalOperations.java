package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        // Terminal operations are the one that produces the result,it triggers the processing of stream.

       //1.forEach() -> perform action on each element of stream,it does not return any value.
        List<Integer> l1= Arrays.asList(121,13,18,98,78,65,63);
        l1.stream().filter((Integer x)-> x>20)
                .forEach(x-> System.out.print(x+" "));


        //2.toArray() -> Collects the element of Stream into array.
        System.out.println();
        List<Integer> l2= Arrays.asList(121,13,18,98,78,65,63);
        Object[] a1=l2.stream().filter(x-> x>10).toArray(); // it returns object type array.
        for(Object a:a1) System.out.print(a+" ");
        //for specific array type
        Integer [] arr=l2.stream().filter(x-> x>70).toArray((int size)-> new Integer[size]);
        System.out.println();
        for(Integer x:arr) System.out.print(x+" ");

        //3.reduce(BinaryOperator<T>accumulator) -> does reduction on the elements of stream
        //Perform associate aggregation function.
        List<Integer> l3=Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> getReduced=l3.stream().reduce((s,s1)-> s+s1);
        System.out.println();
        System.out.println(getReduced.get());

        //4.min,max-> Finds the minimum or maximum  element from the stream based on comparator provided.
        List<Integer> l4=Arrays.asList(2,4,7,10);
        Optional<Integer>  minvalue=l4.stream().filter(x-> x>3).min((Integer min1,Integer min2)-> min1-min2);
        System.out.println(minvalue.get());
        Optional<Integer>  minvalue1=l4.stream().filter(x-> x>3).min((Integer min1,Integer min2)-> min2-min1);
        System.out.println(minvalue1.get()); //first in sorted.

        List<Integer> l6=Arrays.asList(2,4,7,10);
        Optional<Integer>  maxvalue=l4.stream().filter(x-> x>3).max((Integer min1,Integer min2)-> min1-min2);
        System.out.println(maxvalue.get());

        List<Integer> l7=Arrays.asList(2,4,7,10);
        Optional<Integer>  maxvalue1=l4.stream().filter(x-> x>3).max((Integer min1,Integer min2)-> min2-min1);
        System.out.println(maxvalue1.get());

        //count(),collect()

        //anyMatch() -> check if any value in stream, matching the given predicate and return boolean.
        boolean check=l7.stream().anyMatch(x-> x>300);
        System.out.println(check);

        //allMatch();
        boolean allmatch=l7.stream().allMatch(x-> x>1);
        System.out.println(allmatch);

        //noneMatch();
        boolean nonematch=l7.stream().noneMatch(x-> x>9);
        System.out.println(nonematch);

        //findFirst();
        Optional<Integer> first=l7.stream().filter(x-> x>3).findFirst();
        System.out.println(first.get());

        // findAny();
        Optional<Integer> any=l7.stream().findAny();
        System.out.println(any.get());

        //once terminal operation is used on stream(),it is closed/consumed and can not be used for another terminal operation.

        // ParallelStream() -> help to perform operation on stream concurrently,taking advantage of
        // multicore cpu, ParallelStream() method is used instead of regular stream() method.
        // internally it does -> task spitting: it uses "spliterator" functions to split the data into multiple chunks.
        // Task submissions and parallel processing: Use Fork-Join pool technique.

        List<Integer> l8= Arrays.asList(11,22,33,44,55,66,77,88,99);
        // sequential processing
        long sequentialProcessingStartTime=System.currentTimeMillis();
        System.out.println();
        l8.stream().map(x-> x*x).forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("Sequential Processing Time "+(System.currentTimeMillis()-sequentialProcessingStartTime)+" milliSeconds");

        // ParallelProcessing
        long parallelProcessingStartTime = System.currentTimeMillis();
        l8.parallelStream().map(x->x*x).forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("Parallel Processing Time "+(System.currentTimeMillis()-parallelProcessingStartTime)+" milliseconds");







    }
}
