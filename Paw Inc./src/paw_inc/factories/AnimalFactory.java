package paw_inc.factories;

import paw_inc.entities.animals.Animal;
import paw_inc.entities.animals.Cat;
import paw_inc.entities.animals.Dog;

public class AnimalFactory {

    private AnimalFactory() {}

    public static AnimalFactory getInstance() {
        return new AnimalFactory();
    }

    public Animal createAnimal(String type, String name, int age, int secondaryParameter) {
        switch (type) {
            case "Cat":
                return new Cat(name, age, secondaryParameter);
            case "Dog":
                return new Dog(name, age, secondaryParameter);
            default:
                return null;
        }
    }
}
