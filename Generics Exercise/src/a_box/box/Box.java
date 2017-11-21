package a_box.box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {

    private List<T> elements;

    public Box() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public <T extends Number> int countGraterThan(T element) {
        int count = 0;

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).compareTo(element) > 1) {
                count ++;
            }
        }

        return count;
    }

}
