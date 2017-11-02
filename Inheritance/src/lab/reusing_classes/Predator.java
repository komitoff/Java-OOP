package lab.reusing_classes;

public class Predator extends Animal{
    private int health;

    public Predator(int health) {
        this.health = health;
    }

    public void feed(Food food) {
        super.eat(food);
        this.health ++;
    }
}
