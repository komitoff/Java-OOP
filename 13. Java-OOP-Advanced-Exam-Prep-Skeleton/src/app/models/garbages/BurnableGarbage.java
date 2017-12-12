package app.models.garbages;

import app.waste_disposal.annotations.Burnable;

@Burnable
public class BurnableGarbage extends AbstractGarbage {

    public BurnableGarbage(String name, double weight, double volumePerKg) {
        super(name, weight, volumePerKg);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getVolumePerKg() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}
