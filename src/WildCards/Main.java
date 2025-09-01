package WildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());
        List<Bus> busList=new ArrayList<>();
        Vehicle v1=new Vehicle();
        Bus b1=new Bus();

        //v1=b1; this is valid because parent object can keep child object.
        // but
        // vehicleList= BusList // Not valid.
        // BusList= VehicleList // Not valid.

        Print printObj= new Print();
        printObj.setPrintValues(vehicleList);
       // printObj.setPrintValues(busList);
        // not work because this busList is not child of VehicleList
       // public void setPrintValues(List<? extends Vehicle> vehicleList)
        // this is upperbound list of vehicle and its subclass can pass.
        printObj.setPrintValues(busList); // now we can pass.

        //(List<? super Vehicle> vehicleList)- Lower bound(Class and its Parents)
        // for lower bound bus will not work.
        //(List<?> vehicleList) - unbounded(Accept anything any list)

    }
}
