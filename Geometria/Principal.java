package Geometria;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("------------------------------");

        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        System.out.println("------------------------------");

        Quadrado[] quadrado = new Quadrado[2];
        quadrado[0] = new Quadrado(3);
        quadrado[1] = new Quadrado(5);

        System.out.println("Área do quadrado: " + quadrado[0].calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado[0].calcularPerimetro());
        System.out.println("Área do quadrado: " + quadrado[1].calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado[1].calcularPerimetro());
        System.out.println("------------------------------");

        Quadrado losango = new Quadrado(4);
        System.out.println(losango.toString());
        System.out.println("Área do losango: " + losango.calcularArea());
        System.out.println("Perímetro do losango: " + losango.calcularPerimetro());
    }
}
