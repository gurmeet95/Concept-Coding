package pojoEnumFinal;

public enum EnumSample {
    //internally it extends java.lang.enum class so can not extend any other class.
    // can not be instantiated because Constructor is private.
    MONDAY, //0 == public static final int MONDAY=0;
    TUESDAY, //1
    WEDNESDAY, //2
    THURSDAY, //3
    FRIDAY, //4
    SATURDAY,  //5
    SUNDAY;  //6
    //these are constants.
    // internally these enums values are from  zero to so on(if we not define).
}
