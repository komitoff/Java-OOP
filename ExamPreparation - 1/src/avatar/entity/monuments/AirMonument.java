package avatar.entity.monuments;

public class AirMonument extends Monument {

    private int airAffinity;

    public int getAirAffinity() {
        return airAffinity;
    }

    private void setAirAffinity(int airAffinity) {
        this.airAffinity = airAffinity;
    }

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.setAirAffinity(airAffinity);
    }
}
