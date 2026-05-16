package Geometria;

public class Retangulo implements FiguraGeometrica, FiguraEscalavel {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
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
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
