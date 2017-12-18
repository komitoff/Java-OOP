package app.waste_disposal.models.wastes;

@app.waste_disposal.annotations.Recyclable
public class RecyclableWaste extends AbstractWaste {
    public RecyclableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
