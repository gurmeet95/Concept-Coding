package pojoEnumFinal;

public class CustomEnumFinal {
    public static void main(String[] args) {
        CustomEnumValue sampleVar=CustomEnumValue.getEnumFromValue(7);
        System.out.println(sampleVar.getComments());
    }
}
