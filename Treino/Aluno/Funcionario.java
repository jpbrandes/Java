public class Funcionario extends Pessoa {
    private int registro;
    private double salario;

    public Funcionario(String nome, String telefone, Data nascimento, int registro, double salario) {
        super(nome, telefone, nascimento);
        this.registro = registro;
        this.salario = salario;
    }

    public Funcionario(String nome, Data nascimento, int registro, double salario) {
        super(nome, nascimento);
        this.registro = registro;
        this.salario = salario;
    }

    public int getRegistro() { return this.registro; }
    public double getSalario() { return this.salario; }

    public void setRegistro(int registro) { this.registro = registro; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return super.toString() + "\nRegistro: " + registro + "\nSalário: R$ " + salario;
    }
}
