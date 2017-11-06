package wild_farm.factories;


import wild_farm.animals.*;

public class AnimalFactory {

    private AnimalFactory() {}

    public static AnimalFactory getInstance() {
        return new AnimalFactory();
    }

    public Animal createAnimal(String type, String[] params) {
        String name = params[1];
        double weight = Double.valueOf(params[2]);
        String livingRegion = params[3];
        switch (type) {
            case "Cat":
                String breed = params[4];
                return new Cat(name, weight, livingRegion, breed);
            case "Tiger":
                return new Tiger(name, weight, livingRegion);
            case "Mouse":
                return new Mouse(name, weight, livingRegion);
            case "Zebra":
                return new Zebra(name, weight, livingRegion);
            default:
                throw new IllegalArgumentException("Invalid animal type!");
        }
    }
}
