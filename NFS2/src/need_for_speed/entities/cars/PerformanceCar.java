package need_for_speed.entities.cars;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {

    private List<String> addOns;

    public List<String> getAddOns() {
        return addOns;
    }

    private void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower,
                          int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = new ArrayList<>();
    }

    @Override
    public void tuneCar(int index, String addOn) {
        this.addOns.add(addOn);
        super.tuneCar(index, addOn);
    }

    @Override
    protected void setHorsepower(int horsepower) {
        super.setHorsepower(horsepower + (horsepower / 2));
    }

    @Override
    protected void setSuspension(int suspension) {
        super.setSuspension(suspension + (suspension / 4));
    }

    public String toString() {
        return super.toString() + "\n" +
                "Add-ons: " + addOnsForPrinting();
    }

    private String addOnsForPrinting() {
        if (addOns.isEmpty()) {
            return "None";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < addOns.size(); i++) {
            sb.append(addOns.get(i));
            sb.append(", ");
        }

        return sb.substring(0, sb.length()-2).toString();
    }
}
