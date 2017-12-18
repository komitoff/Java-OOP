package app.waste_disposal.models.wastes;

@app.waste_disposal.annotations.Storable
public class StorableWaste extends AbstractWaste {
    public StorableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
