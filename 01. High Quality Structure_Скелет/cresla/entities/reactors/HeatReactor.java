package cresla.entities.reactors;

import cresla.interfaces.Container;

public class HeatReactor extends AbstractReactor {

    private int heatReductionIndex;

    public HeatReactor(int id, Container container, int heatReductionIndex) {
        super(id, container);
        this.heatReductionIndex = heatReductionIndex;
    }

    public int getHeatReductionIndex() {
        return heatReductionIndex;
    }
}
