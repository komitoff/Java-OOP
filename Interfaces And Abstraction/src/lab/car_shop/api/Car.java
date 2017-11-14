package lab.car_shop.api;

public interface Car {
    final Integer TYRES = 4;

    String getCountryProduced();
    String getModel();
    String getColor();
    Integer getHorsePower();
}
