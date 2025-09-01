package interfaceLearning;

public class Sparrow implements Bird{

    @Override
    public void canFly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public int getMinimumFlightHeight() {
        return 100;
    }
}
