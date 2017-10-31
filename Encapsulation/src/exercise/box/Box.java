package exercise.box;

public class Box {
    private double length;
    private double width;
    private double height;

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double calcSurfaceArea() {
        double surfaceArea = (2 * this.length * this.width) +
                (2 * this.length * this.height) +
                (2 * this.width * this.height);
        return surfaceArea;
    }

    public double calcLateralSurfaceArea() {
        double lateralSurfaceArea = (2 * this.length * this.height) +
                (2 * this.width * this.height);
        return lateralSurfaceArea;
    }

    public double calcVolume() {
        double volume = this.length * this.width * this.height;
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f\n" +
                "Lateral Surface Area - %.2f\n" +
                "Volume - %.2f", this.calcSurfaceArea(), this.calcLateralSurfaceArea(), this.calcVolume());
    }
}
