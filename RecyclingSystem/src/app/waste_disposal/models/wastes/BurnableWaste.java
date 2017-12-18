package app.waste_disposal.models.wastes;

@app.waste_disposal.annotations.Burnable
public class BurnableWaste extends AbstractWaste {
    public BurnableWaste(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
