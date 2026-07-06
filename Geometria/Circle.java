package Geometry;

public class Circle implements GeometricShape, ScalableShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
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
}
