package paw_inc;

import paw_inc.controllers.AnimalCenterManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalCenterManager acm = new AnimalCenterManager();
        String command = reader.readLine();

        while (!command.equals("Paw Paw Pawah")) {
            String[] tokens = command.split(" \\| ");
            switch (tokens[0]) {
                case "RegisterAdoptionCenter":
                    acm.registerAdoptionCenter(tokens[1]);
                    break;
                case "RegisterCleansingCenter":
                    acm.registerCleansingCenter(tokens[1]);
                    break;
                case "RegisterDog":
                    acm.registerDog(tokens[1], Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]), tokens[4]);
                    break;
                case "RegisterCat":
                    acm.registerCat(tokens[1], Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]), tokens[4]);
                    break;
                case "SendForCleansing":
                    acm.sendForCleansing(tokens[1], tokens[2]);
                    break;
                case "Cleanse":
                    acm.cleanse(tokens[1]);
                    break;
                case "Adopt":
                    acm.adopt(tokens[1]);
                    break;
                default:
                    break;
            }
            command = reader.readLine();
        }

        acm.printStatistics();
    }
}
