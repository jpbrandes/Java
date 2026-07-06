public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("------------------------------");

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("------------------------------");

        Square[] square = new Square[2];
        square[0] = new Square(3);
        square[1] = new Square(5);

        System.out.println("Square area: " + square[0].calculateArea());
        System.out.println("Square perimeter: " + square[0].calculatePerimeter());
        System.out.println("Square area: " + square[1].calculateArea());
        System.out.println("Square perimeter: " + square[1].calculatePerimeter());
        System.out.println("------------------------------");

        Square rhombus = new Square(4);
        System.out.println(rhombus.toString());
        System.out.println("Rhombus area: " + rhombus.calculateArea());
        System.out.println("Rhombus perimeter: " + rhombus.calculatePerimeter());
    }
}
