package lab.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public final double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
