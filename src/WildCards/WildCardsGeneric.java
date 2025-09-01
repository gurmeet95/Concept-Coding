package WildCards;

import java.util.List;

public class WildCardsGeneric {
    // wild card method
    public void computeList(List<? extends Number> source, List<? extends Number>destination){
          //we can pass list of different types.
        // we can use lower bound - super.
    }
     //generic type method
    public <T extends Number> void computeList1(List<T>source,List<T>destination){
     // force us to pass list of same type.
    }
}
/*

 */
