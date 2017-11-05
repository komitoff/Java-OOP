package exercise.vehicles.exceptions;

public class CarNotEnoughFuelException extends NotEnoughFuelException {

    @Override
    public String getMessage() {
        return "Car needs refueling";
    }
}
