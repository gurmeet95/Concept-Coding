package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceOfStreamOperations {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream=l1.stream()
                .filter(x-> x>3)
                .peek(x-> System.out.print(x+" "))
                .map(x-> x*-1)
                .peek(x-> System.out.print(x+" "))
                .sorted()
                .peek(x-> System.out.print(x+" "));
        List<Integer> l2=numberStream.collect(Collectors.toList());

        //Excpected output - 4,7,10  then -4,-7,-10 then -10,-7,-4
        // real output - 4 -4 7 -7 10 -10 -10 -7 -4
        // why result is this
        // Because stream take first element and complete all operation on that,then pick second element.
        //But some intermediate operation require all data like sorted.
        // that's why in our example stream complete filter,peek,map and peek in one go but pick second element before processing sorted.
        // after all element picked then it go to sorted then peek.

        //Generally each element processed sequentially and can perform multiple operations,
        // this feature help stream() to fast process the task.
        // for example: if we need to return any number which is greater than 5 processing will stop at 7 itself.
        // i.e no processing of elements present after 7.
    }
}
