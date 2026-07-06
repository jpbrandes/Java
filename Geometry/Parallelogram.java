package Geometry;

public abstract class Parallelogram implements GeometricShape, ScalableShape {
    double base;
    double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public abstract double calculatePerimeter();

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
