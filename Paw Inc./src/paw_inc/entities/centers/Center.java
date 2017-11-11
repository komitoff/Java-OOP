package paw_inc.entities.centers;

import paw_inc.entities.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Center {
    private String name;
    private List<Animal> storedAnimals;

    public List<Animal> getStoredAnimals() {
        return storedAnimals;
    }

    public Animal getAnimal(int index) {
        return storedAnimals.get(index);
    }

    public void addAnimal(Animal animal) {
        this.storedAnimals.add(animal);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Center(String name) {
        this.setName(name);
        this.storedAnimals = new ArrayList<>();
    }
}
