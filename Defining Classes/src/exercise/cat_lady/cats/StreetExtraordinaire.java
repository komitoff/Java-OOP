package exercise.cat_lady.cats;

import exercise.cat_lady.cats.Cat;

public class StreetExtraordinaire extends Cat {
    private double decibelsOfMeows;

    public double getDecibelsOfMeows() {
        return decibelsOfMeows;
    }

    public void setDecibelsOfMeows(double decibelsOfMeows) {
        this.decibelsOfMeows = decibelsOfMeows;
    }

    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        super(name);
        this.setDecibelsOfMeows(decibelsOfMeows);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",
                this.getClass().getSimpleName(), this.getName(), this.getDecibelsOfMeows());
    }
}
