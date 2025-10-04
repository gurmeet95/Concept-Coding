package collection_learning.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarComparableMain {
    public static void main(String[] args) {
        List<CarComparable> list=new ArrayList<>();
        list.add(new CarComparable("Swift","Diesel"));
        list.add(new CarComparable("Baleno","CNG"));

        Collections.sort(list);
        for(CarComparable car: list){
            System.out.println(car.carName+" "+car.carType);
        }
    }
}
