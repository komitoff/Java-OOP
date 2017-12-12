package app.models.garbages;

import app.waste_disposal.annotations.Disposable;

@Disposable
public class StorableGarbage extends AbstractGarbage {

    public StorableGarbage(String name, double weight, double volumePerKg) {
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
