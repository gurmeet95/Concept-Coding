package interfaceLearning;

public interface Bird_Private_Method {
    // these private with body feature came from java 9.
    void canFly();
    public default void flyingHeight(){
        myStaticPublic();
        myPrivateMethod();
        myPrivateStaticMethod();
    }
    static void myStaticPublic(){
        myPrivateStaticMethod();
    }
    private void myPrivateMethod(){

    }
    private static void myPrivateStaticMethod(){

    }


}
