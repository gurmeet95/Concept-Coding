package GenericClasses;

public class Print <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    // Generic type <T> can be any non-primitive object.
}
