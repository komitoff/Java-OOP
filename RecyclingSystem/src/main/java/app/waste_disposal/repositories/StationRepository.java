package app.waste_disposal.repositories;

public class StationRepository implements Repository<Double, Double> {

    private double energy;
    private double capital;

    public StationRepository() {
        this.capital = 0;
        this.energy = 0;
    }
    @Override
    public void addEnergy(Double energy) {
        this.energy += energy;
    }

    @Override
    public void addCapital(Double capital) {
        this.capital += capital;
    }

    @Override
    public Double getEnergy() {
        return this.energy;
    }

    @Override
    public Double getCapital() {
        return this.capital;
    }
}
