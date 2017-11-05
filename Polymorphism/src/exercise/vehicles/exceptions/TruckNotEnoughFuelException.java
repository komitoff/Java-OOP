package exercise.vehicles.exceptions;

public class TruckNotEnoughFuelException extends NotEnoughFuelException {

    public String getMessage() {
        return "Truck needs refueling";
    }
}
