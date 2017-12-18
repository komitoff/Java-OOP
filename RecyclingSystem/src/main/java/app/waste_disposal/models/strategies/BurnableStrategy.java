package app.waste_disposal.models.strategies;

import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.processing.ProcessingDataImpl;

public class BurnableStrategy extends AbstractStrategy {

    public BurnableStrategy() {
    }

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double totalVolume = garbage.getVolumePerKg() * garbage.getWeight();

        double energyProduced = totalVolume;
        double energyUsed = totalVolume / 5;

        double capitalUsed = 0;
        double capitalEarned = 0;

        return new ProcessingDataImpl(energyProduced - energyUsed,
                capitalEarned - capitalUsed);
    }
}
