package paw_inc.entities.animals;

public class Dog extends Animal {

    private int amountOfCommands;

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    private void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }

    public Dog(String name, int age, int amountOfCommands) {
        super(name, age);
        this.setAmountOfCommands(amountOfCommands);
    }
}
