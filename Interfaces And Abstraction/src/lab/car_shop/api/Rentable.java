package lab.car_shop.api;

import lab.car_shop.api.Car;

public interface Rentable extends Car {
    int getMinRentDay();

    Double getPricePerDay();
}
