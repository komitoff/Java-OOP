package exercise.vehicles;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void refuel(double quantity);

    public abstract void drive(double kilometers);
}
