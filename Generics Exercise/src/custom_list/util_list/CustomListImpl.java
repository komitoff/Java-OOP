package custom_list.util_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListImpl<T extends Comparable> {

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
}
