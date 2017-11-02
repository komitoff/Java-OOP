package lab.reusing_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Animal {
    protected List<Food> foodEaten;

    public Animal() {
        this.foodEaten = new ArrayList<>();
    }

    public final void eat(Food food) {
        this.foodEaten.add(food);
    }

    public final void eatAll(Food[] food) {
        Collections.addAll(foodEaten, food);
    }
}
