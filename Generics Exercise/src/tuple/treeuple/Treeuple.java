package tuple.treeuple;

public class Treeuple<K, V, E> {

    private K key;
    private V value;
    private E element;

    public Treeuple() {

    }

    public void put(K key, V value, E element) {
        this.setKey(key);
        this.setElement(element);
        this.setValue(value);
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

    public E getElement() {
        return element;
    }

    private void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", key, value, element);
    }
}
