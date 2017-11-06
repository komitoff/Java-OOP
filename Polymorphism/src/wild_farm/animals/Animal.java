package wild_farm.animals;

import wild_farm.foods.Food;

public abstract class Animal {
    private String name;
    private double weight;
    protected int foodEaten;

    protected Animal(String name, double weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    public abstract void eat(Food food);

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }


}
