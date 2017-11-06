package wild_farm;

import wild_farm.animals.Animal;
import wild_farm.factories.AnimalFactory;
import wild_farm.factories.FoodFactory;
import wild_farm.foods.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalFactory animalFactory = AnimalFactory.getInstance();
        FoodFactory foodFactory = FoodFactory.getInstance();
        List<Animal> animalList = new ArrayList<>();
        String input = reader.readLine();

        while (!input.equals("End")) {

            String[] animalTokens = input.split("\\s+");
            String type = animalTokens[0];

            input = reader.readLine();
            String[] foodTokens = input.split("\\s+");
            String foodType = foodTokens[0];

            int foodAmount = Integer.valueOf(foodTokens[1]);

            try {
                Animal animal = animalFactory.createAnimal(type, animalTokens);
                animal.makeSound();
                animalList.add(animal);
                try {
                    Food food = foodFactory.createFood(foodType, foodAmount);
                    try {
                        animal.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            input = reader.readLine();
        }

        animalList.stream().forEach(System.out::println);
    }
}
