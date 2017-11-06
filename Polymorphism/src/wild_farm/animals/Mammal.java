package wild_farm.animals;

import wild_farm.foods.Food;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public String getLivingRegion() {
        return livingRegion;
    }

    protected void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    protected Mammal(String name, double weight, String livingRegion) {
        super(name, weight);
        this.setLivingRegion(livingRegion);
    }

    @Override
    public abstract void eat(Food food);

    @Override
    public abstract void makeSound();

}
