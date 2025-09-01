package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Eagle bird=new Eagle();
        Class eagleBird= Eagle.class; //1st way
//        try {
//            Class eagleBird=Class.forName("Eagle"); second way.
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        //  Class eagleBird1=bird.getClass(); 3rd way Using object of class.
        // To check data of any class we need to create object of class - Class.

        System.out.println(eagleBird.getName());
        System.out.println(Modifier.toString(eagleBird.getModifiers()));

        Method[] methods=eagleBird.getMethods(); // It will return list of Public methods of this class and parent class also.

        for(Method method:methods){
            System.out.println("Method name "+ method.getName());
            System.out.println("Return Type "+ method.getReturnType());
            System.out.println("Class Name  "+ method.getDeclaringClass());
            System.out.println("********************");
        }
        Method[] declaredMethods=eagleBird.getDeclaredMethods(); // will return all methods of this class only,Public ,private all.
        for(Method method: declaredMethods){
            System.out.println("Method name "+ method.getName());

        }
        //same for field getField() return public field,getDeclareField() return all field.
        Field[] fields= eagleBird.getFields();
        for(Field field:fields){
            System.out.println("Field Name="+ field.getName());
            //breed only because that field is public.
        }

    }
}
