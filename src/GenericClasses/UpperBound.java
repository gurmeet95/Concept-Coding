package GenericClasses;

public class UpperBound <T extends Number>{
    // now Generic can be of type number of anyone from its child class.
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
