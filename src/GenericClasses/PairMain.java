package GenericClasses;

public class PairMain {
    public static void main(String[] args) {
        Pair<String,Integer> values=new Pair<String,Integer>("One",1);
        System.out.println("Key is "+values.getKey()+" and value is "+values.getValue());

    }
}
