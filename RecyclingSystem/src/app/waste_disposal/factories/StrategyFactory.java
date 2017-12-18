package app.waste_disposal.factories;

import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.models.strategies.BurnableStrategy;
import app.waste_disposal.models.strategies.RecyclableStrategy;
import app.waste_disposal.models.strategies.StorableStrategy;

public class StrategyFactory {

    private StrategyFactory() {}

    public static StrategyFactory getInstance() {
        return new StrategyFactory();
    }

    public GarbageDisposalStrategy createStrategy(String type) {

        if ("Recyclable".equals(type)) {
            return new RecyclableStrategy();
        }
        if ("Burnable".equals(type)) {
            return new BurnableStrategy();
        }
        if ("Storable".equals(type)) {
            return new StorableStrategy();
        }
        return null;
    }
}
