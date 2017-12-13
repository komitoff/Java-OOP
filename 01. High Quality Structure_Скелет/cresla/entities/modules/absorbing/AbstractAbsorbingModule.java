package cresla.entities.modules.absorbing;

import cresla.entities.modules.AbstractModule;
import cresla.interfaces.AbsorbingModule;

public abstract class AbstractAbsorbingModule extends AbstractModule implements AbsorbingModule {

    private int id;
    private int heatAbsorbing;

    protected AbstractAbsorbingModule(int id, int heatAbsorbing) {
        this.id = id;
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(String.format("%s Module - %d%s", this.getClass().getSimpleName(), this.getId(), System.lineSeparator()))
                .append(String.format("%Heat absorbing: %d", this.getHeatAbsorbing()))
                .toString();
    }
}
