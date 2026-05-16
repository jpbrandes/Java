package Geometria;

public class Quadrado implements FiguraGeometrica, FiguraEscalavel {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getDiminuicao() {
        return 0;
    }

    public double getAumento() {
        return 0;
    }

    public void setDiminuicao(double diminuicao) {
        // Implementation for setting diminuicao
    }

    public void setAumento(double aumento) {
        // Implementation for setting aumento
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
