package exercise.cat_lady;

import exercise.cat_lady.cats.Cat;
import exercise.cat_lady.cats.Cymric;
import exercise.cat_lady.cats.Siamese;
import exercise.cat_lady.cats.StreetExtraordinaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Cat> cats = new HashMap<>();
        String command = reader.readLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("StreetExtraordinaire")) {
                Cat streetCat = new StreetExtraordinaire(tokens[1], Double.valueOf(tokens[2]));
                cats.put(tokens[1], streetCat);
            }
            else if (tokens[0].equals("Siamese")) {
                Cat siameseCat = new Siamese(tokens[1], Double.valueOf(tokens[2]));
                cats.put(tokens[1], siameseCat);
            }
            else if (tokens[0].equals("Cymric")) {
                Cat cymric = new Cymric(tokens[1], Double.valueOf(tokens[2]));
                cats.put(tokens[1], cymric);
            }
            command = reader.readLine();
        }

        String catName = reader.readLine();
        if (cats.containsKey(catName)) {
            System.out.println(cats.get(catName));
        }
    }
}
