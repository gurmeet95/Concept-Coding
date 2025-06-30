package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //1. filter()
        // filter(Predicate<T> predicate)
        // filter is intermediate operation to filter things from one stream and convert them in new stream.
        Stream<String> nameStream=Stream.of("Ram","Himanshu","Shyam","Varsha","Eng","Hin");
        Stream<String> filterdStream= nameStream.filter((String name)-> name.length()<=3);
        List<String> result=filterdStream.collect(Collectors.toList());
        System.out.println(result);


        //2.map() -> Used to transform each element.
        // map(Function<T,R> mapper)
        Stream<String> nameStream1=Stream.of("Ram","Himanshu","Shyam","Varsha","Eng","Hin");
        Stream<String> filterdname=nameStream1.map( name-> name.toLowerCase());
        List<String> result1=filterdname.collect(Collectors.toList());
        System.out.println(result1);

        //3.flatmap()
        //flatmap(Function<T,Stream<R>> mapper)
        // Used to iterate over each element of complex collection,and help to flatten it.
        List<List<String>> sentenceList= Arrays.asList(
                Arrays.asList("I","LOVE","JAVA"),
                Arrays.asList("I","AM","BECOMING"),
                Arrays.asList("STRONG","VERSION","OF","MYSELF")
        );
        Stream<String> wordStream1=sentenceList.stream().flatMap((List<String> s)-> s.stream());
        List<String> result2=wordStream1.collect(Collectors.toList());
        System.out.println(result2); //output-> [I, LOVE, JAVA, I, AM, BECOMING, STRONG, VERSION, OF, MYSELF]
        Stream<String> wordstream2=sentenceList.stream().flatMap(sentence -> sentence.stream()).
                map(sentence -> sentence.toLowerCase());
        List<String> result3= wordstream2.collect(Collectors.toList());
        System.out.println(result3);

        //4. distinct();
        Integer arr[]={1,2,2,3,4,4,5,6,6,7,8,8,9};
        List<Integer> l1=Arrays.stream(arr).distinct().collect(Collectors.toList());
        System.out.println(l1);

        //5.sorted()
        Integer arr1[]={11,2,45,32,7,65,21,13,1,49};
        List<Integer> l2=Arrays.stream(arr1).sorted().collect(Collectors.toList());
        System.out.println(l2);

        //sorting in descending order
        Integer arr2[]={11,2,45,32,7,65,21,13,1,49};
        List<Integer> l3=Arrays.stream(arr1).sorted((val1,val2)->val2-val1).collect(Collectors.toList());
        System.out.println(l3);


        //6.Peek(For Printing) Help us to see the intermediate result of stream which is getting processed.
        List<Integer> l5=Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> peeking=l5.stream().filter((Integer x)-> x>2).peek(x-> System.out.print(x+" ")).
                map(x-> -1*x);
        // only work if terminal operation is there on stream.for this terminal operation is there in line 65
        List<Integer> l6 =peeking.collect(Collectors.toList());
        System.out.println();
        System.out.println(l6);

        //7.limit() -> Truncate the stream, to have no longer than given maxSize.
        List<Integer> l7=Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> a1=l7.stream().limit(3);
        List<Integer> l8=a1.collect(Collectors.toList());
        System.out.println(l8);

        //8.skip()-> skip the first n elements of streams.
        List<Integer> l9=Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> a2=l7.stream().skip(3);
        List<Integer> ll=a2.collect(Collectors.toList());
        System.out.println(ll);


        //9.mapToInt()-> helps to work with primitive int data type
        //mapToInr(ToIntFunction<T> mapper)
        List<String> numbers=Arrays.asList("2","1","4","7");
        IntStream numberStream=numbers.stream().mapToInt(number -> Integer.parseInt(number));
        int [] numbersarray= numberStream.toArray();
       for(int x:numbersarray){
           System.out.print(x+" ");
       }
        //10.mapToLong()
        //11.mapToDouble()






    }
}
