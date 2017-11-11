package paw_inc.controllers;

import paw_inc.entities.animals.Animal;
import paw_inc.entities.animals.Cat;
import paw_inc.entities.animals.Dog;
import paw_inc.entities.centers.AdoptionCenter;
import paw_inc.entities.centers.CleansingCenter;
import paw_inc.factories.AnimalFactory;
import paw_inc.factories.CenterFactory;
import paw_inc.io.TerminalWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalCenterManager {

    private AnimalFactory animalFactory;
    private CenterFactory centerFactory;
    private HashMap<String, AdoptionCenter> adoptionCentersRegistered;
    private HashMap<String, CleansingCenter> cleansingCentersRegistered;
    private List<Animal> adoptedAnimals;
    private List<Animal> cleansedAnimals;

    public AnimalCenterManager() {
        this.animalFactory = AnimalFactory.getInstance();
        this.centerFactory = CenterFactory.getInstance();
        this.adoptionCentersRegistered = new HashMap<>();
        this.cleansingCentersRegistered = new HashMap<>();
        this.adoptedAnimals = new ArrayList<>();
        this.cleansedAnimals = new ArrayList<>();
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
        if (adoptionCentersRegistered.containsKey(adoptionCenterName) &&
                cleansingCentersRegistered.containsKey(cleansingCenterName)) {
            List<Animal> animals = adoptionCentersRegistered.get(adoptionCenterName).getStoredAnimals();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getCleansingStatus() == false) {
                    cleansingCentersRegistered.get(cleansingCenterName).addAnimal(animals.get(i));
                }
            }
        }
    }

    public void cleanse(String cleansingCenterName) {
        if (cleansingCentersRegistered.containsKey(cleansingCenterName)) {
            List<Animal> animals = cleansingCentersRegistered.get(cleansingCenterName).getStoredAnimals();
            cleansedAnimals.addAll(animals);
            for (Map.Entry<String, AdoptionCenter> adoptionCenters : adoptionCentersRegistered.entrySet()) {
                for (int i = 0; i < adoptionCenters.getValue().getStoredAnimals().size(); i++) {
                    if (adoptionCenters.getValue().getStoredAnimals().contains(animals.get(i))) {
                        adoptionCenters.getValue().getStoredAnimals().get(i).setCleansingStatus(true);
                    }
                }
            }
            cleansingCentersRegistered.get(cleansingCenterName).getStoredAnimals().clear();
        }
    }

    public void adopt(String adoptionCenterName) {
        adoptedAnimals.addAll(
                adoptionCentersRegistered.get(adoptionCenterName).getCleansedAnimals());
        adoptionCentersRegistered.get(adoptionCenterName).getStoredAnimals().clear();
    }

    public void registerCastrationCenter(String name) {

    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName) {

    }

    public void castrate(String castrationCenterName) {}

    public void castrationStatistics() {

    }

    public void printStatistics() {
        TerminalWriter.writeLine("Paw Incorporative Regular Statistics");
        TerminalWriter.writeLine("Adoption Centers: " + adoptionCentersRegistered.size());
        TerminalWriter.writeLine("Cleansing Centers: " + cleansingCentersRegistered.size());
        TerminalWriter.writeLine("Adopted Animals: " + printAdoptedAnimals());
        TerminalWriter.writeLine("Cleansed Animals: " + printCleansedAnimals());
        TerminalWriter.writeLine("Animals Awaiting Adoption: " + calcAnimalsAwaitingAdoption());
        TerminalWriter.writeLine("Animals Awaiting Cleansing: " + calcAnimalsAwaitingCleansing());
    }

    private String printAdoptedAnimals() {
        StringBuilder sb = new StringBuilder();
        List<Animal> sorted = adoptedAnimals.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        for (int i = 0; i < sorted.size(); i++) {
            sb.append(sorted.get(i).getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2).toString();
    }

    private String printCleansedAnimals() {
        StringBuilder sb = new StringBuilder();
        List<Animal> sorted = cleansedAnimals.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        for (int i = 0; i < sorted.size(); i++) {
            sb.append(sorted.get(i).getName());
            sb.append(", ");
        }

        return sb.substring(0, sb.length() - 2).toString();
    }

    private int calcAnimalsAwaitingAdoption() {
        int count = 0;

        for(Map.Entry<String, AdoptionCenter> center : adoptionCentersRegistered.entrySet()) {
            count += center.getValue().getCleansedAnimals().size();
        }

        return count;
    }

    private int calcAnimalsAwaitingCleansing() {
        int count = 0;

        for (Map.Entry<String, CleansingCenter> center : cleansingCentersRegistered.entrySet()) {
            count += center.getValue().getStoredAnimals().size();
        }

        return count;
    }
}
