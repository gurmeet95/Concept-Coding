package exceptionHandling;

public class CustomMain {
    public static void main(String[] args) {
        try {
            method();
        }catch (CustomException e) {
            //we can handle it here or also throw it again to main.
        }

    }
    public static void method() throws CustomException{
        throw new CustomException("Some issue arise");
    }

}
