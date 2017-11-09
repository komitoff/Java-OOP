package need_for_speed.entities.cars;

import java.util.HashSet;
import java.util.Set;

public class PerformanceCar extends Car {

    private Set<String > addOns;

    public Set<String> getAddOns() {
        return addOns;
    }

    public void addAddOn(String addOn) {
        this.addOns.add(addOn);
    }

    public PerformanceCar(String brand, String model, int yearOfProduction,
                          int horsepower, int acceleration, int suspension,
                          int durability) {
        super(brand, model, yearOfProduction, horsepower + (horsepower / 2),
                acceleration, suspension + (suspension / 4),
                durability);
        this.addOns = new HashSet<>();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d\n" +
                "%d HP, 100 m/h in %d s\n" +
                "%d Suspension force, %d Durability",
                this.getBrand(), this.getModel(), this.getYearOfProduction(),
                this.getHorsepower(), this.getAcceleration(),
                this.getSuspension(), this.getDurability());
    }
}
