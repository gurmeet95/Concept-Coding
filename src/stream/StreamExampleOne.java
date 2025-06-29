package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleOne
{
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10,15,20,30,50,60);
        int count=0;
        for(Integer l: l1){
            if(l>15){
                count++;
            }
        }
        System.out.println("Total count with for each is "+count);

        // Now with stream
       Long output= l1.stream().filter((Integer l )-> l>15).count();
        System.out.println("Total count from Stream "+output);
    }
}
// Diffrent ways to create Stream.
// 1. Stream<Integer> streamFromIntegerList= l1.stream();
// 2.Integer [] salaryArray={30,40,50};
// Stream<Integer> streamFromArray=Arrays.stream(salaryArray);
// 3. From Static method
// Stream<Integer> streamFromStaticMethod=Stream.of(100,200,300,400);