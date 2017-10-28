package exercise.car_salesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        Map<String, Engine> engines = readEngines(n, reader);
        int m = Integer.valueOf(reader.readLine());
        List<Car> cars = readCars(m, reader, engines);
        cars.forEach(System.out::println);
    }

    private static List<Car> readCars(int m, BufferedReader reader, Map<String, Engine> engines) throws IOException {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            Engine engine = engines.get(tokens[1]);
            String weight = "n/a";
            String color = "n/a";

            if (tokens.length == 3) {
                try {
                    int wgt = Integer.valueOf(tokens[2]);
                    weight = tokens[2];
                } catch (Exception e) {
                    color = tokens[2];
                }
            }
            else if (tokens.length == 4){
                weight = tokens[2];
                color = tokens[3];
            }
            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }
        return cars;
    }

    public static Map<String, Engine> readEngines(int n, BufferedReader reader) throws IOException {
        Map<String, Engine> engines = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.valueOf(tokens[1]);
            String engineDisplacement = "n/a";
            String efficiency = "n/a";

            if (tokens.length == 3) {
                try {
                    int displacement = Integer.valueOf(tokens[2]);
                    engineDisplacement = tokens[2];
                } catch (Exception e) {
                    efficiency = tokens[2];
                }
            }
            else if (tokens.length == 4){
                engineDisplacement = tokens[2];
                efficiency = tokens[3];
            }

            Engine engine = new Engine(model, power, engineDisplacement, efficiency);
            engines.put(model, engine);
        }
        return engines;
    }
}
