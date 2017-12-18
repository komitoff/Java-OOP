package app.waste_disposal.models.strategies;

import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.processing.ProcessingDataImpl;

public class StorableStrategy extends AbstractStrategy {

    public StorableStrategy() {
    }

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double totalVolume = garbage.getVolumePerKg() * garbage.getWeight();

        double energyProduced = 0;
        double energyUsed = 0.13 * totalVolume;

        double capitalEarned = 0;
        double capitalUsed = 0.65 * totalVolume;

        return new ProcessingDataImpl(energyProduced - energyUsed, capitalEarned - capitalUsed);
    }
}
