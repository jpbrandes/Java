package Interfaces;

public class Pessoa {

    protected String nome;
    protected double salario;
    protected int codigo;

    // Construtor
    public Pessoa(String nome, double salario, int codigo) {
        this.nome = nome;
        this.salario = salario;
        this.codigo = codigo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getCodigo() {
        return codigo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nSalário: " + salario +
               "\nCódigo: " + codigo;
    }
}