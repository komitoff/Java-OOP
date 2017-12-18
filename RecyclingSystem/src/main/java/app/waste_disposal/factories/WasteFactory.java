package app.waste_disposal.factories;

import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.wastes.BurnableWaste;
import app.waste_disposal.models.wastes.RecyclableWaste;
import app.waste_disposal.models.wastes.StorableWaste;

public class WasteFactory {

    private WasteFactory() {}

    public static WasteFactory getInstance() {
        return new WasteFactory();
    }

    public Waste createWaste(String type, String name, double volumePerKg, double weight) {
        if ("Burnable".equals(type)) {
            return new BurnableWaste(name, volumePerKg, weight);
        }
        if ("Recyclable".equals(type)) {
            return new RecyclableWaste(name, volumePerKg, weight);
        }
        if ("Storable".equals(type)) {
            return new StorableWaste(name, volumePerKg, weight);
        }
        return null;
    }
}
