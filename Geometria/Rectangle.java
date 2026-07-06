package Geometry;

public class Rectangle implements GeometricShape, ScalableShape {
    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + height);
    }

    public double getDecrease() {
        return 0;
    }

    public double getIncrease() {
        return 0;
    }

    public void setDecrease(double decrease) {
        // Implementation for setting decrease
    }

    public void setIncrease(double increase) {
        // Implementation for setting increase
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
