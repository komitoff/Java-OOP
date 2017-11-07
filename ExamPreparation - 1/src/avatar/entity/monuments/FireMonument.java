package avatar.entity.monuments;

public class FireMonument extends Monument {

    private int fireAffinity;

    public int getFireAffinity() {
        return fireAffinity;
    }

    private void setFireAffinity(int fireAffinity) {
        this.fireAffinity = fireAffinity;
    }

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.setFireAffinity(fireAffinity);
    }
}
