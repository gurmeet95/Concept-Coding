package annotations;

import java.util.ArrayList;
import java.util.List;

public class Mobile {

    @Deprecated
    boolean batteryFull(){
        return false;
    }

    //@safeVarargs help to surpass heap pollution warning.
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumbersList){
        Object[] objectsList= logNumbersList;
        List<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        objectsList[0]=stringList;
  }

}
// @Target - Confirms where the annotation on which @Target is used can be applied.
// @Retention- This meta-annotation tells,how Annotation will be stored in Java.
// RetentionPolicy.SOURCE,.CLASS,.RUNTIME

// public @interface MyCustomAnnotationWithInherited. - Now this is treated as Annotation.
//@Documented - Annotations are ignored when we create JavaDoc,@Documented help to keep annotations in JAVA Doc.
//@Inherited - Child class can also able to access(have that annotation) that annotation on which it is used.
//@Repeatable - Allows us to use same Annotation more than once at same place.
//Custom Annotation we can create like we create Interface