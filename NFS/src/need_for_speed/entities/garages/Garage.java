package need_for_speed.entities.garages;

import need_for_speed.entities.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> parkedCars;

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public void remove(int index) {
        this.parkedCars.remove(index);
    }

    public void addCar(Car car) {
        this.parkedCars.add(car);
    }

    public Car getCar(int index) {
        return parkedCars.get(index);
    }

    public Garage() {
        this.parkedCars = new ArrayList<>();
    }
}
