package exercise.vehicles;

import exercise.vehicles.exceptions.TruckNotEnoughFuelException;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void refuel(double quantity) {
        if (quantity > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        super.setFuelQuantity(super.getFuelQuantity() + (quantity * 0.95));
    }

    @Override
    public void drive(double kilometers) throws IllegalArgumentException {
        double totalKilometersCanDrive = super.getFuelQuantity() / super.getFuelConsumption();
        if (kilometers >= totalKilometersCanDrive) {
            throw new IllegalArgumentException("Truck needs refueling");
        }
        double littersLeft = super.getFuelQuantity() - (kilometers * super.getFuelConsumption());
        super.setFuelQuantity(littersLeft);
    }
}
