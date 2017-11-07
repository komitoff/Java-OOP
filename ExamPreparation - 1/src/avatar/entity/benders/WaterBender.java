package avatar.entity.benders;

public class WaterBender extends Bender {

    private double waterClarity;

    public double getWaterClarity() {
        return waterClarity;
    }

    private void setWaterClarity(double waterClarity) {
        this.waterClarity = waterClarity;
    }

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.setWaterClarity(waterClarity);
    }
}
