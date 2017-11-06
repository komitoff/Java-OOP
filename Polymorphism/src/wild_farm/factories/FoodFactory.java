package wild_farm.factories;

import wild_farm.foods.Food;
import wild_farm.foods.Meat;
import wild_farm.foods.Vegetable;

public class FoodFactory {

    private FoodFactory() {}

    public static FoodFactory getInstance() {
        return new FoodFactory();
    }

    public Food createFood(String type, int amount) {
        switch (type) {
            case "Vegetable":
                return new Vegetable(amount);
            case "Meat":
                return new Meat(amount);
            default:
                throw new IllegalArgumentException("Invalid food type!");
        }
    }
}
