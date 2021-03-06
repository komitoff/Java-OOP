package wild_farm.animals;

import wild_farm.foods.Food;
import wild_farm.foods.Meat;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return String.format("Zebra[%s, %s, %s, %d]",
                this.getName(), df.format(this.getWeight()),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
