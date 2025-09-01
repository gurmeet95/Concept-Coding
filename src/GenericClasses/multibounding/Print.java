package GenericClasses.multibounding;

public class Print<T extends ParentClass & Interface1 & Interface2>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
