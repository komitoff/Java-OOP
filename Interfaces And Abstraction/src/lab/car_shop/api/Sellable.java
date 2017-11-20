package lab.car_shop.api;

import lab.car_shop.api.Car;

public interface Sellable extends Car {
    double getPrice();
}