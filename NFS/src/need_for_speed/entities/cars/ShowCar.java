package need_for_speed.entities.cars;

public class ShowCar extends Car {

    private int stars;

    public int getStars() {
        return stars;
    }

    private void setStars(int stars) {
        this.stars = stars;
    }

    public ShowCar(String brand, String model, int yearOfProduction,
                   int horsepower, int acceleration, int suspension,
                   int durability) {
        super(brand, model, yearOfProduction, horsepower,
                acceleration, suspension, durability);
        this.setStars(0);
    }

    public void increaseStars(int stars) {
        this.setStars(this.stars + stars);
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
