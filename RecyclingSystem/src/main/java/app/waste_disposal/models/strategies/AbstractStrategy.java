package app.waste_disposal.models.strategies;

import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.processing.ProcessingDataImpl;

public abstract class AbstractStrategy implements GarbageDisposalStrategy {

    private ProcessingData processingData;

    protected AbstractStrategy() {
    }

    public ProcessingData processGarbage(Waste garbage) {
        return new ProcessingDataImpl(0, 0);
    }
}
