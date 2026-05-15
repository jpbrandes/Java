package SistemaCadastro;

public class PessoaSC {
    private String nome;
    private String telefone;
    private DataSC datanascimento; // Isso se chama composição, onde a classe PessoaSC tem um objeto da classe DataSC como um de seus atributos.

    public PessoaSC(String nome, String telefone, DataSC datanascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
    }

    public PessoaSC(String nome, DataSC datanascimento) {
        this.nome = nome;
        this.telefone = "0000-0000"; // Telefone padrão
        this.datanascimento = datanascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public DataSC getDatanascimento() {
        return this.datanascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDatanascimento(DataSC datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nData de Nascimento: " + this.datanascimento;
    }
}
