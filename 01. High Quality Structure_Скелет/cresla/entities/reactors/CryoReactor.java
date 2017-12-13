package cresla.entities.reactors;

import cresla.interfaces.Container;

public class CryoReactor extends AbstractReactor {

    private int cryoProductionIndex;

    public CryoReactor(int id, Container container, int cryoProductionIndex) {
        super(id, container);
        this.cryoProductionIndex = cryoProductionIndex;
    }

    public int getCryoProductionIndex() {
        return cryoProductionIndex;
    }
}
