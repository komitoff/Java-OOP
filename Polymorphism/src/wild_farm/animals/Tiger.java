package wild_farm.animals;

import wild_farm.foods.Food;
import wild_farm.foods.Vegetable;

import java.text.DecimalFormat;

public class Tiger extends Felime {



    public Tiger(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return String.format("Tiger[%s, %s, %s, %d]",
                this.getName(), df.format(this.getWeight()),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
