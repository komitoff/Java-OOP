package exercise.cat_lady.cats;

public class Siamese extends Cat {
    private double earSize;

    public double getEarSize() {
        return earSize;
    }

    public void setEarSize(double earSize) {
        this.earSize = earSize;
    }

    public Siamese(String name, double earSize) {
        super(name);
        this.setEarSize(earSize);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",
                this.getClass().getSimpleName(), this.getName(), this.getEarSize());
    }
}
