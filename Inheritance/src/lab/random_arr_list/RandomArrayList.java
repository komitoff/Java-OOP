package lab.random_arr_list;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    Random random;


    public RandomArrayList() {
        this.random = new Random();
    }
    public Object getRandomElement() {
        int index = random.nextInt(super.size());
        swap(index, super.size() - 1);
        return super.remove(super.size() - 1);
    }

    private void swap(int index, int i) {
        Object objAtIndex = super.get(index);
        Object objAtEnd = super.get(i);
        super.set(i, objAtEnd);
        super.set(index, objAtEnd);
    }
}
