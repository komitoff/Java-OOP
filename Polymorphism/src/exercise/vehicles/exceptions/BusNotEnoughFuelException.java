package exercise.vehicles.exceptions;

public class BusNotEnoughFuelException extends NotEnoughFuelException {

    @Override
    public String getMessage() {
        return "Bus needs refueling";
    }
}
