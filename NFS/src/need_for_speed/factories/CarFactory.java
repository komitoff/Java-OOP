package need_for_speed.factories;

import need_for_speed.entities.cars.Car;
import need_for_speed.entities.cars.PerformanceCar;
import need_for_speed.entities.cars.ShowCar;

public class CarFactory {

    private CarFactory() {}

    public static CarFactory getInstance() {
        return new CarFactory();
    }

    public Car createCar(String type, String brand, String model,
                         int yearOfProduction, int horsepower, int acceleration,
                         int suspension, int durability) {
        switch (type) {
            case "Performance":
                return new PerformanceCar(brand, model, yearOfProduction,
                        horsepower, acceleration, suspension, durability);
            case "Show":
                return new ShowCar(brand, model, yearOfProduction,
                        horsepower, acceleration, suspension, durability);
            default:
                return null;
        }
    }
}
