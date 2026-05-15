package SistemaCadastro;

public class AlunoSC extends PessoaSC {
    private String matricula;

    public AlunoSC(String nome, String telefone, DataSC datanascimento, String matricula) {
        super(nome, telefone, datanascimento);
        this.matricula = matricula;
    }

    public AlunoSC(String nome, DataSC datanascimento, String matricula) {
        super(nome, datanascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula;
    }
    
}
