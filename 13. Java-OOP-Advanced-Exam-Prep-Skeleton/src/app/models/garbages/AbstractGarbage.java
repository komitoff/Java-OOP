package app.models.garbages;

import app.models.processings.ProcessingDataImpl;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public abstract class AbstractGarbage implements Waste {

    protected String name;
    protected double weight;
    protected double volumePerKg;
    protected ProcessingData processingData;

    protected double eneryProduced;
    protected double energyUsed;
    protected double capitalEarned;
    protected double capitalUsed;
    protected double totalGarbageVolume;

    protected AbstractGarbage(String name, double weight, double volumePerKg) {
        this.name = name;
        this.weight = weight;
        this.volumePerKg = volumePerKg;
        this.setTotalGarbageVolume(weight, volumePerKg);
    }

    protected void setTotalGarbageVolume(double weight, double volumePerKg) {
        this.totalGarbageVolume = weight * volumePerKg;
    }

    protected double getTotalGarbageVolume() {
        return this.totalGarbageVolume;
    }

    protected ProcessingData getProcessingData() {
        return this.processingData;
    }

    protected void setProcessingData() {
        this.processingData = new ProcessingDataImpl(0, 0);
    }
}
