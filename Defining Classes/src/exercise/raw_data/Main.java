package exercise.raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            Car car = new Car(tokens[0], Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]),
                    tokens[4], Double.valueOf(tokens[5]), Integer.valueOf(tokens[6]),
                    Double.valueOf(tokens[7]), Integer.valueOf(tokens[8]),
                    Double.valueOf(tokens[9]), Integer.valueOf(tokens[10]),
                    Double.valueOf(tokens[11]), Integer.valueOf(tokens[12]));
            cars.add(car);
        }

        String command = reader.readLine();
        boolean flag = false;
        if (command.equals("fragile")){
            for (Car car : cars) {
                if (car.getCargo().getType().equals("fragile")) {
                    for (Tire tire : car.getTires()) {
                        if (tire.getPressure() < 1) {
                            flag = true;
                        }
                    }
                }

                if (flag) {
                    System.out.println(car.getModel());
                }
            }
        }
        else {
            for(Car car : cars) {
                if (car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
