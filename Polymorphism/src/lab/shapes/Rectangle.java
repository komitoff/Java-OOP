package lab.shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
