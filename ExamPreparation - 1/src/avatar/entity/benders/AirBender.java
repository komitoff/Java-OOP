package avatar.entity.benders;

public class AirBender extends Bender {

    private double aerialIntegrity;

    public double getAerialIntegrity() {
        return aerialIntegrity;
    }

    private void setAerialIntegrity(double aerialIntegrity) {
        this.aerialIntegrity = aerialIntegrity;
    }

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.setAerialIntegrity(aerialIntegrity);
    }
}
