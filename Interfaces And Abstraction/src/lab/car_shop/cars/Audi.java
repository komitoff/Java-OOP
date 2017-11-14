package lab.car_shop.cars;

import lab.car_shop.api.Rentable;

public class Audi implements Rentable {

    private Integer minRentDay;
    private double pricePerDay;
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Audi(String model, String color, Integer horsePower,
                String countryProduced, int minRentDay, double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
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
    public String toString() {
        return String.format("This is %s produced and have %d tires",
                model, TYRES);
    }
}
