package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CatMain {
    public static void main(String[] args )throws Exception
    {
        Class cat=Class.forName("reflection.Cat"); // only cat giving No class found exception.
        Object catobject= cat.newInstance();


        Method methodInvoke=cat.getMethod("getInvoke",int.class,String.class,String.class);
        methodInvoke.invoke(catobject,1,"Dogges Bhai","Desi");

        //setting the value of field.
        //public
        Cat cat1=new Cat();
        Field field=cat.getDeclaredField("breed1");
        field.set(cat1,"Desiii");
        System.out.println(cat1.breed1);
        // private
        Field field1=cat.getDeclaredField("canSwim");
        field1.setAccessible(true);
        // reflection breach encapsulation can access private things too.
        field1.set(cat1,true);
        if(field1.getBoolean(cat1)){
            System.out.println("Value is set to true");
        }





    }
}
