package annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all") // now no warning s given,if we want we give name of
// specific warnnig also instead of all. - deppreceation,unused etc.
public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.batteryFull();
        //mobile.batteryFull() give warning that this method id deprecated.
        //@safeVarargs help to surpass heap pollution warning.
        List<Integer> l1=Arrays.asList(3, 4, 5);
        Mobile.printLogValues(l1);

    }
}
