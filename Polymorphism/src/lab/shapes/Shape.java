package lab.shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

}
