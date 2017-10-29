package exercise.google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static HashMap<String, Person> people = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();



        while (!"End".equals(command)){
            String[] tokens = command.split("\\s+");

            switch (tokens[1]) {
                case "pokemon":
                    tryAddPokemon(tokens);
                    break;
                case "parents":
                    tryAddParents(tokens);
                    break;
                case "children":
                    tryAddChild(tokens);
                    break;
                case "car":
                    tryAddCar(tokens);
                    break;
                case "company":
                    tryAddCompany(tokens);
                    break;
                default: break;
            }

            command = reader.readLine();
        }

        String personInfo = reader.readLine();
        if (people.containsKey(personInfo)) {
            System.out.println(people.get(personInfo));
        }
    }

    private static void tryAddCompany(String[] tokens) {
        if (!people.containsKey(tokens[0])) {
            Person person = new Person(tokens[0]);
            people.put(tokens[0], person);
        }

        people.get(tokens[0]).setCompany(tokens[2] + " " + tokens[3] + " " + tokens[4]);
    }

    private static void tryAddCar(String[] tokens) {
        if (!people.containsKey(tokens[0])) {
            Person person = new Person(tokens[0]);
            people.put(tokens[0], person);
        }

        people.get(tokens[0]).setCar(tokens[2] + " " + tokens[3]);
    }

    private static void tryAddChild(String[] tokens) {
        if (!people.containsKey(tokens[0])) {
            Person person = new Person(tokens[0]);
            people.put(tokens[0], person);
        }

        if (!people.get(tokens[0]).getChildren().contains(tokens[2])) {
            people.get(tokens[0]).getChildren().add(tokens[2] + " " + tokens[3]);
        }
    }

    private static void tryAddParents(String[] tokens) {
        if (!people.containsKey(tokens[0])) {
            Person person = new Person(tokens[0]);
            people.put(tokens[0], person);
        }

        if (!people.get(tokens[0]).getParents().contains(tokens[2])) {
            people.get(tokens[0]).getParents().add(tokens[2] + " " + tokens[3]);
        }
    }

    private static void tryAddPokemon(String[] tokens) {
        if (!people.containsKey(tokens[0])) {
            Person person = new Person(tokens[0]);
            people.put(tokens[0], person);
        }

        if (!people.get(tokens[0]).getPokemons().contains(tokens[2])) {
            people.get(tokens[0]).getPokemons().add(tokens[2] + " " + tokens[3]);
        }
    }
}
