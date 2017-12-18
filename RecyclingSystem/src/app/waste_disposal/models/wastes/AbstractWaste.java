package app.waste_disposal.models.wastes;

import app.waste_disposal.contracts.Waste;

public abstract class AbstractWaste implements Waste {

    private String name;
    private double volumePerKg;
    private double weight;

    protected AbstractWaste(String name, double volumePerKg, double weight) {
        this.name = name;
        this.volumePerKg = volumePerKg;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getVolumePerKg() {
        return this.volumePerKg;
    }

    public double getWeight() {
        return this.weight;
    }
}
