public class Square implements GeometricShape, ScalableShape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
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
        return "Square{" +
                "side=" + side +
                '}';
    }
}
