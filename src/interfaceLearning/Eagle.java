package interfaceLearning;

public class Eagle implements Bird{

    @Override
    public void canFly() {
        System.out.println("Eagle can fly");
    }

    @Override
    public int getMinimumFlightHeight() {
        return 100;
    }
    public void isAlive(){
        if (Bird.canBreathe()) {

            System.out.println("Yes Bird is alive");
        }
    }

}
