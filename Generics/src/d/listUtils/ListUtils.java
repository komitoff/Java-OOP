package d.listUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils<T> {

    public static <T extends Comparable> T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Empty List!");
        }
        T max = list.stream().max((x, y) -> x.compareTo(y)).get();
        return max;
    }

    public static <T extends Comparable> T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Empty List!");
        }

        T min = list.stream().min((x, y) -> x.compareTo(y)).get();
        return min;
    }

    public static <T extends Comparable> List<Integer> getNullIndices(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Empty list !");
        }
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                indices.add(i);
            }
        }

        return indices;
    }

    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> src) {
        for (List<? extends T> inner : src) {
            dest.addAll(inner);
        }
    }

    public static <T> void addAll(
            List<? super T> dest, List<? extends T> source) {
        for (T element : source) {
            dest.add(element);
        }
    }
}
