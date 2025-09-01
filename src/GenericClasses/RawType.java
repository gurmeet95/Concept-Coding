package GenericClasses;

public class RawType {
    public static void main(String[] args) {
        Print rawType=new Print();
        // This is raw type
        // internally it passes object as parametrized type.
        rawType.setValue(1);
        rawType.setValue("1");
    }
}
