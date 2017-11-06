package exercise.vehicles;

public class Car extends Vehicle {

    public Car (double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, fuelQuantity);
    }

    @Override
    public void refuel(double quantity) throws IllegalArgumentException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (quantity > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.setFuelQuantity(super.getFuelQuantity() + quantity);
    }

    @Override
    public void drive(double kilometers) throws IllegalArgumentException {
        double totalKilometersCanDrive = super.getFuelQuantity() / super.getFuelConsumption();
        if (kilometers >= totalKilometersCanDrive) {
            throw new IllegalArgumentException("Car needs refueling");
        }
        double littersLeft = super.getFuelQuantity() - (kilometers * super.getFuelConsumption());
        super.setFuelQuantity(littersLeft);
    }
}
