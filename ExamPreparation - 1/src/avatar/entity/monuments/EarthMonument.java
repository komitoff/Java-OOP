package avatar.entity.monuments;

public class EarthMonument extends Monument {

    private int earthAffinity;

    public int getEarthAffinity() {
        return earthAffinity;
    }

    private void setEarthAffinity(int earthAffinity) {
        this.earthAffinity = earthAffinity;
    }

    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.setEarthAffinity(earthAffinity);
    }
}
