package app.models.garbages;

import app.models.processings.ProcessingDataImpl;
import app.waste_disposal.annotations.Disposable;
import app.waste_disposal.contracts.ProcessingData;

@Disposable
public class RecyclableGarbage extends AbstractGarbage {

    public RecyclableGarbage(String name, double weight, double volumePerKg) {
        super(name, weight, volumePerKg);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public double getVolumePerKg() {
        return super.volumePerKg;
    }

    @Override
    public double getWeight() {
        return super.weight;
    }

    public ProcessingData getProcessingData() {
        return super.processingData;
    }

    protected void setProcessingData() {
        this.eneryProduced = 0;
        this.energyUsed = super.getTotalGarbageVolume() / 2d;
        this.capitalEarned = 400 * this.weight;
        this.capitalUsed = 0;

        this.processingData = new ProcessingDataImpl(this.eneryProduced - this.energyUsed, this.capitalEarned - this.capitalEarned);
    }
}
