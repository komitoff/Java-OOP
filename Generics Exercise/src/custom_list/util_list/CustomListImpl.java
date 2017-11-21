package custom_list.util_list;

import java.util.*;
import java.util.function.Consumer;

public class CustomListImpl<T extends Comparable> implements Iterable{

    private List<T> innerList;

    public CustomListImpl() {
        this.innerList = new ArrayList<>();
    }

    public void add (T element ) {
        innerList.add(element);
    }

    public T remove (int index) {
        return innerList.remove(index);
    }

    public boolean contains(T element) {
        return innerList.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(innerList, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T el : innerList) {
            if (el.compareTo(element) > 0) {
                count ++;
            }
        }

        return count;
    }

    public T getMax() {
        return innerList.stream().max((x, y) -> x.compareTo(y)).get();
    }

    public T getMin() {
        return innerList.stream().min((x, y) -> x.compareTo(y)).get();
    }

    public int getSize() {
        return innerList.size();
    }

    public T get(int index) {
        return innerList.get(index);
    }

    public void sort() {
        Collections.sort(innerList, (x, y)-> x.compareTo(y));
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        for (int i = 0; i < innerList.size(); i++) {
            action.accept(innerList.get(i));
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
