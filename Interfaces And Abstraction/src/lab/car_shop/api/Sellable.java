package lab.car_shop.api;

import lab.car_shop.api.Car;

public interface Sellable extends Car {
    Double price = 0.0;

    Double getPrice();
}
