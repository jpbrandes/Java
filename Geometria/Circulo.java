package Geometria;

public class Circulo implements FiguraGeometrica, FiguraEscalavel {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
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
}
