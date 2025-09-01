package GenericClasses;

public class UpperBoundMain {
    public static void main(String[] args) {


        // UpperBound<String> s1=new UpperBound<String>();
        // giving error because String is not in bound of Number.

        UpperBound<Float> s2 = new UpperBound<>();
        s2.setValue(3.5f);
    }
}
