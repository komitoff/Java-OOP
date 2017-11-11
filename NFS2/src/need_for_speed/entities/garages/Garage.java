package need_for_speed.entities.garages;

import need_for_speed.entities.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> parkedCars;

    public Garage() {
        this.parkedCars = new ArrayList<>();
    }
}
