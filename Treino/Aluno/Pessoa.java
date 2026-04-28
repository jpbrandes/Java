public class Pessoa {
    private String nome;
    private String telefone;
    private Data nascimento;

    public Pessoa(String nome, String telefone, Data nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = " ";
    }

    public String getNome() { return this.nome; }
    public String getTelefone() { return this.telefone; }

    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nNascimento: " + nascimento;
    }
}
