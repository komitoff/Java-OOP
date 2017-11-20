package lab.car_shop.cars;
import lab.car_shop.api.Car;
import lab.car_shop.api.Sellable;

import java.io.Serializable;

public class Seat implements Sellable, Car, Serializable {
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;
    private double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "This is " + this.getModel() + " produced in " + this.getCountryProduced() + " and have " + Car.TYRES + " tires";
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
