package collection_learning.queue;

public class CarComparable implements Comparable<CarComparable>{
    String carName;
    String carType;
    CarComparable(String name,String type){
        this.carName=name;
        this.carType=type;
    }
    @Override
    public int compareTo(CarComparable o2) {
        return this.carType.compareTo(o2.carType);
    }
}
