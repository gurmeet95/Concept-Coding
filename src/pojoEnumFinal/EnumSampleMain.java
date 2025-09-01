package pojoEnumFinal;

public class EnumSampleMain {
    public static void main(String[] args) {
        /* Common functions which is used
        -values();
        -Ordinal();
        -valueOf();
        -name();
       */

        //1.usage of Values() and ordinal()
        for(EnumSample sample:EnumSample.values()){
            System.out.println(sample.ordinal());
            // ordinals - default values
            //return enum sample [];
        }

        //2.usage of valueOf() and name();
        EnumSample enumSample=EnumSample.valueOf("FRIDAY");
        System.out.println(enumSample.name());

    }
}
