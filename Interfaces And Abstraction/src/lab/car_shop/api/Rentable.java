package lab.car_shop.api;

import lab.car_shop.api.Car;

public interface Rentable extends Car {
    Integer minRentDays = 0;
    double pricePerDay = 0;

    Integer getMinRentDay();
    double getPricePerDay();

}
