package paw_inc.entities.animals;

public class Cat extends Animal {

    private int intelligenceCoefficient;

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    private void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public Cat(String name, int age, int intelligenceCoefficient) {
        super(name, age);
        this.setIntelligenceCoefficient(intelligenceCoefficient);
    }
}
