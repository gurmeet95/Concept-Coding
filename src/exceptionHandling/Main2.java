package exceptionHandling;
//try/catch/finally and try/finally
public class Main2 {
    public static void main(String[] args) {
        //finally can be used after try or after catch block.
        // finally will  executed always even if its some things returns from try or catch.
        // only one finally is allowed.
        // only if jvm issue,system shutdown or process kill then finally not executed.1.c
        // we can also rethrow exception from catch,
        try{
             method1("dummy");
             return;
        }finally{
            System.out.println("I am from finally.");
        }
    }
    public static void method1(String name){
    }
}
