package pojoEnumFinal;

public class OverRideEnumMain {
    public static void main(String[] args) {
        OverRideEnum defaultSample=OverRideEnum.FRIDAY;
        defaultSample.dummyData();
        OverRideEnum overrideMonday= OverRideEnum.MONDAY;
        overrideMonday.dummyData();
    }
}
