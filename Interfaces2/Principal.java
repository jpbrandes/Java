package Interfaces2
import javax.swing.JOptionPane;

public class Principal {

    private static final int TAMANHO_VETOR = 2;

    public static void main(String[] args) {

        Aluno[] alunos = criarVetorAlunos();

        executarSistema(alunos);
    }

    public static void executarSistema(Aluno[] alunos) {

        boolean cadastroConcluido = false;

        while (!cadastroConcluido) {

            try {

                int indice = solicitarIndice(alunos);

                Aluno aluno = alunos[indice];

                preencherNome(aluno);

                int media = calcularMedia();

                aluno.setMedia(media);

                exibirAluno(aluno);

                cadastroConcluido = true;

            } catch (NumberFormatException e) {

                mostrarErro(
                        "Digite apenas números inteiros."
                );

            } catch (ArrayIndexOutOfBoundsException e) {

                mostrarErro(
                        "Índice inválido."
                );

            } catch (NullPointerException e) {

                mostrarErro(
                        "Não existe objeto nessa posição."
                );

            } catch (ArithmeticException e) {

                mostrarErro(
                        "Quantidade de provas deve ser maior que zero."
                );

            } catch (IllegalArgumentException e) {

                mostrarErro(
                        e.getMessage()
                );

            } catch (Exception e) {

                mostrarErro(
                        "Operação cancelada pelo usuário."
                );
            }
        }
    }

    public static Aluno[] criarVetorAlunos() {

        Aluno[] vetor = new Aluno[TAMANHO_VETOR];

        vetor[0] = new Aluno();

        return vetor;
    }

    public static int solicitarIndice(Aluno[] alunos) {

        int indice = lerInteiro(
                "Digite o índice do vetor (0 ou 1):"
        );

        if (indice < 0 || indice >= alunos.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (alunos[indice] == null) {
            throw new NullPointerException();
        }

        return indice;
    }

    public static void preencherNome(Aluno aluno) {

        String nome = JOptionPane.showInputDialog(
                "Digite o nome do aluno:"
        );

        if (nome == null) {
            throw new RuntimeException();
        }

        aluno.setNome(nome);
    }

    public static int calcularMedia() {

        int somaNotas = lerInteiro(
                "Digite a soma das notas:"
        );

        int quantidadeProvas = lerInteiro(
                "Digite a quantidade de provas:"
        );

        if (quantidadeProvas <= 0) {
            throw new ArithmeticException();
        }

        return somaNotas / quantidadeProvas;
    }

    public static int lerInteiro(String mensagem) {

        String entrada = JOptionPane.showInputDialog(
                mensagem
        );

        if (entrada == null) {
            throw new RuntimeException();
        }

        return Integer.parseInt(entrada);
    }

    public static void exibirAluno(Aluno aluno) {

        JOptionPane.showMessageDialog(
                null,
                aluno.toString()
        );
    }

    public static void mostrarErro(String mensagem) {

        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "ERRO",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
