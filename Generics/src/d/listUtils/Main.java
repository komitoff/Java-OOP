package d.listUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 5, 8);

        List<Integer> IntegerNulls = ListUtils.getNullIndices(integers);

        for (Integer integerNull : IntegerNulls) {
            System.out.println(integerNull);
        }
    }
}
