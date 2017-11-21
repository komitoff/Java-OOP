package tuple.tuple_impl;

import tuple.treeuple.Treeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Treeuple<String, String, String> first = new Treeuple<>();
        Treeuple<String, Integer, Boolean> second = new Treeuple<>();
        Treeuple<String, Double, String> third = new Treeuple<>();

        String[] tokens = reader.readLine().split(" ");
        first.put(tokens[0] + " " + tokens[1], tokens[2], tokens[3]);

        tokens = reader.readLine().split(" ");
        boolean drunk = false;
        if (tokens[2].equals("drunk")) {
            drunk = true;
        }
        second.put(tokens[0], Integer.valueOf(tokens[1]), drunk);

        tokens = reader.readLine().split(" ");
        third.put(tokens[0], Double.valueOf(tokens[1]), tokens[2]);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
