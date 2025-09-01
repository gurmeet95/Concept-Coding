package GenericClasses.multibounding;

public class Main {
    public static void main(String[] args) {
      //  Print<B> p1=new Print<>();
        // Give error for passing B, because only extends Parent implements I1,I2 it will take.
        Print<A> p2=new Print<>();
    }
}
