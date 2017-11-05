package exercise.vehicles.exceptions;

public abstract class NotEnoughFuelException extends Exception {

    @Override
    public String getMessage() {
        return "Vehicle needs refueling";
    }
}
