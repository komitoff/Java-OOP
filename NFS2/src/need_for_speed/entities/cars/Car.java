package need_for_speed.entities.cars;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;

    public String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    protected void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getHorsepower() {
        return horsepower;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    protected void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurability() {
        return durability;
    }

    protected void setDurability(int durability) {
        this.durability = durability;
    }

    protected Car(String brand, String model, int yearOfProduction, int horsepower,
               int acceleration, int suspension, int durability) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYearOfProduction(yearOfProduction);
        this.setHorsepower(horsepower);
        this.setAcceleration(acceleration);
        this.setSuspension(suspension);
        this.setDurability(durability);
    }

    public void tuneCar(int index, String addOn) {
        this.horsepower += index;
        this.suspension += ((index * 50) / 100);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d\n" +
                "    %d HP, 100 m/h in %d s\n" +
                "    %d Suspension force, {durability} Durability",
                brand, model, yearOfProduction, horsepower, acceleration, suspension,durability);
    }
}
