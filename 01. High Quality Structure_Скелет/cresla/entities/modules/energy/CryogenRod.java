package cresla.entities.modules.energy;


import cresla.entities.modules.AbstractModule;
import cresla.interfaces.EnergyModule;

public class CryogenRod extends AbstractEnergyModule{

    private int energyOutput;


    public CryogenRod(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(String.format("%s Module - %d%s", this.getClass().getSimpleName(), super.getId(), System.lineSeparator()))
                .append(String.format("%Energy output: %d", this.getEnergyOutput()))
                .toString();
    }
}
