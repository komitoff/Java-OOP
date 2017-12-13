package cresla.entities.modules.energy;

import cresla.entities.modules.AbstractModule;
import cresla.interfaces.EnergyModule;

public abstract class AbstractEnergyModule extends AbstractModule implements EnergyModule{

    private int id;

    protected AbstractEnergyModule(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return this.id;
    }
}
