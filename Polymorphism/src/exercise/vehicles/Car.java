package exercise.vehicles;

public class Car extends Vehicle {

    public Car (double fuelQuantity, double fuelConsumtion) {
        super.setFuelConsumption(fuelConsumtion  + 0.9);
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public void refuel(double quantity) {
        super.setFuelQuantity(super.getFuelQuantity() + quantity);
    }

    @Override
    public void drive(double kilometers) {

    }
}
