package avatar.entity.benders;

public abstract class Bender {
    private String name;
    private int power;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    protected void setPower(int power) {
        this.power = power;
    }

    protected Bender(String name, int power) {
        this.setName(name);
        this.setPower(power);
    }
}
