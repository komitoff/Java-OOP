package exercise.shopping_spree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] peopleInput = reader.readLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        for (int i = 0; i < peopleInput.length; i++) {
            String[] tokens = peopleInput[i].split("=");
            String name = tokens[0];
            double money = Double.valueOf(tokens[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productsInput = reader.readLine().split(";");

        for (int i = 0; i < productsInput.length; i++) {
            String[] tokens = productsInput[i].split("=");
            String name = tokens[0];
            double cost = Double.valueOf(tokens[1]);
            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = reader.readLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String personsName = tokens[0];
            String productName = tokens[1];
            try {
                people.get(personsName).buyProduct(products.get(productName));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
            command = reader.readLine();
        }

        for(Map.Entry<String, Person> person : people.entrySet()) {
            System.out.print(person.getKey() + " - ");
            if (person.getValue().getBagOfProducts().size() == 0) {
                System.out.println("Nothing bought");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < person.getValue().getBagOfProducts().size(); i++) {
                    sb.append(person.getValue().getBagOfProducts().get(i).getName() + ", ");
                }
                System.out.print(sb.substring(0, sb.length() - 2));
                System.out.println();
            }
        }
    }
}
