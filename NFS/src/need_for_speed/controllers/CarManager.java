package need_for_speed.controllers;

import need_for_speed.entities.cars.Car;
import need_for_speed.entities.cars.PerformanceCar;
import need_for_speed.entities.cars.ShowCar;
import need_for_speed.factories.CarFactory;
import need_for_speed.factories.RaceFactory;
import need_for_speed.entities.garages.Garage;
import need_for_speed.entities.races.Race;

import java.util.LinkedHashMap;

public class CarManager {

    private LinkedHashMap<Integer, Car> registeredCars;
    private LinkedHashMap<Integer, Race> registeredRaces;
    private Garage garage;
    private CarFactory carFactory;
    private RaceFactory raceFactory;

    public CarManager() {
        this.registeredCars = new LinkedHashMap<>();
        this.registeredRaces = new LinkedHashMap<>();
        this.carFactory = CarFactory.getInstance();
        this.raceFactory = RaceFactory.getInstance();
    }

    public void register(int id, String type, String brand,
                  String model, int yearOfProduction, int horsepower,
                  int acceleration, int suspension, int durability) {
        Car car = carFactory.createCar(type, brand, model, yearOfProduction,
                horsepower, acceleration, suspension, durability);
        registeredCars.put(id, car);
    }

    public String check(int id) {
        return this.registeredCars.get(id).toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        Race race = this.raceFactory.createRace(type, length, route, prizePool);
        this.registeredRaces.put(id, race);
    }

    public void participate(int carId, int raceId) {
        if (!this.garage.getParkedCars().contains(registeredCars.get(carId))) {
            this.registeredRaces.get(raceId).addParticipant(carId);
        }
    }

    public String start(int id) {
        if (registeredRaces.containsKey(id)) {

        }
        if (registeredCars.size() < 1) {

        }
        return "Cannot start the race with zero participants.";
    }

    public void park(int id) {
        if (!this.registeredRaces.containsValue(this.registeredCars.get(id))) {
            this.garage.addCar(this.registeredCars.get(id));
        }

    }

    public void unpark(int id) {
        this.garage.remove(id);
    }

    public void tune(int tuneIndex, String addOn) {
        int count = this.garage.getParkedCars().size();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                Car car = this.garage.getParkedCars().get(i);
                car.increaseHorsePower(tuneIndex);
                car.increaseSuspension(tuneIndex);
                if (car instanceof ShowCar) {
                    ((ShowCar) car).increaseStars(tuneIndex);
                }
                if (car instanceof PerformanceCar) {
                    ((PerformanceCar) car).getAddOns().add(addOn);
                }
                this.garage.getParkedCars().set(i, car);
            }
        }
    }
}
