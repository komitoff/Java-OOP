package avatar.entity.benders;

public class EarthBender extends Bender {

    private double groundSaturation;

    public double getGroundSaturation() {
        return groundSaturation;
    }

    private void setGroundSaturation(double groundSaturation) {
        this.groundSaturation = groundSaturation;
    }

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.setGroundSaturation(groundSaturation);
    }
}
