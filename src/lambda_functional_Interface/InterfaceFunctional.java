package lambda_functional_Interface;
@FunctionalInterface
// not mandatory,but if we use this annotation it won't allow to add another abstract method.
public interface InterfaceFunctional {


        //if an interface contains only one abstract method that is called FunctionalInterface.
        // we can have other methods default,static.
        void fly();

}
