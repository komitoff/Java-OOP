package custom_list.util_list;

public interface CustomList<T extends Comparable> {

    void add(T element);

    T remove();

    boolean contains(T element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();
}
