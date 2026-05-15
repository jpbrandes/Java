package SistemaCadastro;

public class FuncionarioSC extends PessoaSC {
    public int registro;
    public double salario;
    
    public FuncionarioSC(int registro, double salario, String nome, String telefone, DataSC datanascimento) {
        super(nome, telefone, datanascimento); // Isso se chama um superconstrutor, onde a classe filha (FuncionarioSC) chama o construtor da classe pai (PessoaSC) para inicializar os atributos herdados.
        this.registro = registro;
        this.salario = salario;
    }

    public FuncionarioSC(int registro, double salario, String nome, DataSC datanascimento) {
        super(nome, datanascimento); // Esse superconstrutor não possui o telefone, então ele vai usar o telefone padrão definido no construtor da classe PessoaSC.
        this.registro = registro;
        this.salario = salario;
    }

    public int getRegistro() {
        return this.registro;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegistro: " + this.registro + "\nSalário: " + this.salario;
    }
}
