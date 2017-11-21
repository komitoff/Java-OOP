package tuple.tuple_impl;

public class Tuple<K, V> {

    private K key;
    private V value;

    public Tuple() {
    }

    public void put(K key, V value) {
        this.setValue(value);
        this.setKey(key);
    }

    public K getKey() {
        return key;
    }

    private void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    private void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%s -> %s", key, value);
    }
}
