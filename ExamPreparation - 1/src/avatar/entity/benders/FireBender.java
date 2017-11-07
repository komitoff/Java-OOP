package avatar.entity.benders;

public class FireBender extends Bender {

    private double heatAggression;

    public double getHeatAggression() {
        return heatAggression;
    }

    private void setHeatAggression(double heatAggression) {
        this.heatAggression = heatAggression;
    }

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
    }
}
