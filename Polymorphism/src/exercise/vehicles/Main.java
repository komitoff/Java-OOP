package exercise.vehicles;

import exercise.vehicles.exceptions.NotEnoughFuelException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carTokens = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.valueOf(carTokens[1])
                , Double.valueOf(carTokens[2]), Double.valueOf(carTokens[3]));
        
        String[] truckTokens = reader.readLine().split("\\s+");

        Vehicle truck = new Truck(Double.valueOf(truckTokens[1]),
                Double.valueOf(truckTokens[2]), Double.valueOf(truckTokens[3]));

        DecimalFormat df = new DecimalFormat("#.##");


        String[] busTokens = reader.readLine().split("\\s+");
        Vehicle bus = new Bus(Double.valueOf(busTokens[1]),
                Double.valueOf(busTokens[2]), Double.valueOf(busTokens[3]));

        int numberOfCommands = Integer.valueOf(reader.readLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commands = reader.readLine().split("\\s+");
            double kilometers = Double.valueOf(commands[2]);

            if ("Drive".equals(commands[0])) {

                if ("Car".equals(commands[1])) {
                    try {
                        tryDrive(kilometers, car);
                        System.out.println("Car travelled " + df.format(kilometers) + " km");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if ("Truck".equals(commands[1])){
                    try {
                        tryDrive(kilometers, truck);
                        System.out.println("Truck travelled " + df.format(kilometers) + " km");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    try {
                        bus.setFuelConsumption(bus.getFuelConsumption() + 1.4);
                        tryDrive(kilometers, bus);
                        System.out.println("Bus travelled " + df.format(kilometers) + " km");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if ("Refuel".equals(commands[0])){
                double litters = Double.valueOf(commands[2]);
                if ("Car".equals(commands[1])) {
                    try {
                        tryRefuel(litters, car);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if ("Truck".equals(commands[1])){
                    try {
                        tryRefuel(litters, truck);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    try {
                        tryRefuel(litters, bus);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else {
                try {
                    tryDrive(kilometers, bus);
                    System.out.println("Bus travelled " + df.format(kilometers) + " km");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println(String.format("Car: %.2f", car.getFuelQuantity()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelQuantity()));
        System.out.println(String.format("Bus: %.2f", bus.getFuelQuantity()));
    }

    private static void tryRefuel(double litters, Vehicle vehicle) throws IllegalArgumentException {
        vehicle.refuel(litters);
    }

    private static void tryDrive(double kilometers, Vehicle vehicle) throws IllegalArgumentException {
        vehicle.drive(kilometers);
    }
}
