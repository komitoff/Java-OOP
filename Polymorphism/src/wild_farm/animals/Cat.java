package wild_farm.animals;

import wild_farm.foods.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String name, double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion);
        this.setBreed(breed);
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return String.format("Cat[%s, %s, %s, %s, %d]",
                this.getName(), this.getBreed(), df.format(this.getWeight()),
                this.getLivingRegion(), super.getFoodEaten());
    }
}
