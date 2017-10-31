package exercise.shopping_spree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] peopleInput = reader.readLine().split(";");
        LinkedHashMap<String, Person> people = new LinkedHashMap<>();
        LinkedHashMap<String, Product> products = new LinkedHashMap<>();

        for (int i = 0; i < peopleInput.length; i++) {
            String[] tokens = peopleInput[i].split("=");
            String name = tokens[0];
            double money = Double.valueOf(tokens[1]);
            Person person = new Person(name, money);
            people.put(name, person);
        }

        String[] productsInput = reader.readLine().split(";");

        for (int i = 0; i < productsInput.length; i++) {
            String[] tokens = productsInput[i].split("=");
            String name = tokens[0];
            double cost = Double.valueOf(tokens[1]);
            Product product = new Product(name, cost);
            products.put(name, product);
        }

        String command = reader.readLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String personsName = tokens[0];
            String productName = tokens[1];

            people.get(personsName).buyProduct(products.get(productName));

            command = reader.readLine();
        }
    }
}
