package paw_inc.controllers;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import paw_inc.entities.animals.Animal;
import paw_inc.entities.animals.Cat;
import paw_inc.entities.animals.Dog;
import paw_inc.entities.centers.AdoptionCenter;
import paw_inc.entities.centers.Center;
import paw_inc.entities.centers.CleansingCenter;
import paw_inc.factories.AnimalFactory;
import paw_inc.factories.CenterFactory;

import java.util.Calendar;
import java.util.HashMap;

public class AnimalCenterManager {

    private AnimalFactory animalFactory;
    private CenterFactory centerFactory;
    private HashMap<String, AdoptionCenter> adoptionCentersRegistered;
    private HashMap<String, CleansingCenter> cleansingCentersRegistered;

    public AnimalCenterManager() {
        this.animalFactory = AnimalFactory.getInstance();
        this.centerFactory = CenterFactory.getInstance();
        this.adoptionCentersRegistered = new HashMap<>();
        this.cleansingCentersRegistered = new HashMap<>();
    }

    public void registerCleansingCenter(String name) {
        if (!cleansingCentersRegistered.containsKey(name)) {
            CleansingCenter center = new CleansingCenter(name);
            cleansingCentersRegistered.put(name, center);
        }
    }

    public void registerAdoptionCenter(String name) {
        if (!adoptionCentersRegistered.containsKey(name)) {
            AdoptionCenter adoptionCenter = new AdoptionCenter(name);
            adoptionCentersRegistered.put(name, adoptionCenter);
        }
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        if (adoptionCentersRegistered.containsKey(adoptionCenterName)) {
            Dog dog = new Dog(name, age, learnedCommands);
            adoptionCentersRegistered.get(adoptionCenterName).addAnimal(dog);
        }
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        if (adoptionCentersRegistered.containsKey(adoptionCenterName)) {
            Cat cat = new Cat(name, age, intelligenceCoefficient);
            adoptionCentersRegistered.get(adoptionCenterName).addAnimal(cat);
        }
     }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        
    }

    public void cleanse(String cleansingCenterName) {

    }

    public void adopt(String adoptionCenterName) {

    }

    void printStatistics() {

    }

}
