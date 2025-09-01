package GenericClasses;

public class PrintMain {
    public static void main(String[] args) {
        Print<Integer> integerPrint= new Print<>();
        integerPrint.setValue(1);
        Integer printValue=integerPrint.getValue();
        System.out.println(printValue);
        Print<String> stringPrint=new Print<>();
        stringPrint.setValue("Gurmeet Chahal");
        String valuePrint= stringPrint.getValue();
        System.out.println(valuePrint);
    }
}
