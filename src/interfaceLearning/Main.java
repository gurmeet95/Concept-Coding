package interfaceLearning;

public class Main {
    public static void main(String[] args) {
        Eagle eagle=new Eagle();
        Sparrow sparrow=new Sparrow();
        eagle.canFly();
        System.out.println(eagle.getMinimumFlightHeight());
        System.out.println(sparrow.getMinimumFlightHeight());
        // Need to implement this Minimum height method for both classes.
        System.out.println(eagle.maximumFlyHeight());
        System.out.println(sparrow.maximumFlyHeight());
        // both class can access it without override it,as it is default method.
        eagle.isAlive();

    }
}
