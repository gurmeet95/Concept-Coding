package WildCards;

import java.util.ArrayList;
import java.util.List;

public class WildGenericsMain {
    public static void main(String[] args) {
        List<Integer> wildCardIntegerSourceList= new ArrayList<>();
        List<Float> wildCardIntegerDestinationList= new ArrayList<>();
        WildCardsGeneric obj=new WildCardsGeneric();
        obj.computeList(wildCardIntegerSourceList,wildCardIntegerDestinationList);
       // obj.computeList1(wildCardIntegerSourceList,wildCardIntegerDestinationList);
        // Error because both list are of different types.
    }
}
