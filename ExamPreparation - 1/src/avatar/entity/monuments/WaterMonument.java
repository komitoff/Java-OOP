package avatar.entity.monuments;

public class WaterMonument extends Monument {

    private int waterAffinity;

    public int getWaterAffinity() {
        return waterAffinity;
    }

    private void setWaterAffinity(int waterAffinity) {
        this.waterAffinity = waterAffinity;
    }

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.setWaterAffinity(waterAffinity);
    }
}
