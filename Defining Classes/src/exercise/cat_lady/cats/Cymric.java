package exercise.cat_lady.cats;

public class Cymric extends Cat {
    private double furLength;

    public double getFurLength() {
        return furLength;
    }

    public void setFurLength(double furLength) {
        this.furLength = furLength;
    }

    public Cymric(String name, double furLength) {
        super(name);
        this.setFurLength(furLength);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",
                this.getClass().getSimpleName(), this.getName(), this.getFurLength());
    }

}
