package app.waste_disposal.models.strategies;

import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.processing.ProcessingDataImpl;

public class RecyclableStrategy extends AbstractStrategy {
    public RecyclableStrategy() {

    }

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double energyProduced = 0;
        double totalVolume = garbage.getVolumePerKg() * garbage.getWeight();
        double energyUsed = totalVolume / 2;

        double capitalEarned = 400 * garbage.getWeight();
        double capitalUsed = 0;

        return new ProcessingDataImpl(energyProduced - energyUsed,
                capitalEarned - capitalUsed);
    }
}
