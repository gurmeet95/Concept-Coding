package GenericClasses;

public class Pair <K,V>{
    // more than one generic
    // we can define as many as generic we want.
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
