package lab.car_shop.cars;

import lab.car_shop.api.Sellable;

public class Seat implements Sellable {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    @Override
    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                model, countryProduced, TYRES);
    }
}
