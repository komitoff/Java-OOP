package app.models.strategies;

import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class GarbageDisposalStrategyImpl implements GarbageDisposalStrategy {
    @Override
    public ProcessingData processGarbage(Waste garbage) {
        return null;
    }
}
