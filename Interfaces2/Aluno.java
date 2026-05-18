package Interfaces2
public class Aluno {

    private String nome;
    private int media;

    public Aluno() {
    }

    public void setNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O nome não pode ficar vazio."
            );
        }

        this.nome = nome.trim();
    }

    public void setMedia(int media) {

        if (media < 0 || media > 10) {
            throw new IllegalArgumentException(
                    "A média deve estar entre 0 e 10."
            );
        }

        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getMedia() {
        return media;
    }

    @Override
    public String toString() {

        return "===== DADOS DO ALUNO ====="
                + "\nNome: " + nome
                + "\nMédia: " + media;
    }
}
