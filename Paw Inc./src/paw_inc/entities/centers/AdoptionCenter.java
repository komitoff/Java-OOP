package paw_inc.entities.centers;

import paw_inc.entities.animals.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptionCenter extends Center {

    public AdoptionCenter(String name) {
        super(name);
    }

    public List<Animal> getCleansedAnimals() {
        return this.getStoredAnimals().stream().filter(x -> x.getCleansingStatus() == true)
                .collect(Collectors.toList());
    }

    public List<Animal> getNotCleansedAnimals() {
        return this.getCleansedAnimals().stream().filter(x -> x.getCleansingStatus() == false)
                .collect(Collectors.toList());
    }
}
