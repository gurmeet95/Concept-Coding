package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class BreakMain {
    public static void main(String[] args) throws  Exception{
        Class breakSing=BreakSingleton.class;

        //to access private constructor too.
        Constructor [] breakConstList=breakSing.getDeclaredConstructors();
        for(Constructor cons: breakConstList){
            System.out.println("Modifier: "+ Modifier.toString(cons.getModifiers()));
            cons.setAccessible(true);
            BreakSingleton breakSingleton=(BreakSingleton) cons.newInstance();
            breakSingleton.fly();
            // It breaks singleton Rules.
            //Reflection is slow.
        }



    }
}
