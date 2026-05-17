package Interfaces;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        // Pergunta quantas pessoas serão cadastradas
        int quantidade = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Quantas pessoas deseja cadastrar?")
        );

        // Cria vetor com tamanho informado
        Vetor vetor = new Vetor(quantidade);

        // Laço de repetição
        for (int i = 0; i < quantidade; i++) {

            JOptionPane.showMessageDialog(null,
                    "Cadastro da pessoa " + (i + 1));

            // Entrada de dados
            String nome = JOptionPane.showInputDialog(
                    "Digite o nome:");

            String salarioStr = JOptionPane.showInputDialog(
                    "Digite o salário:");

            String codigoStr = JOptionPane.showInputDialog(
                    "Digite o código:");

            try {

                // Conversão
                double salario = Double.parseDouble(salarioStr);

                int codigo = Integer.parseInt(codigoStr);

                // Cria pessoa
                Pessoa pessoa = new Pessoa(
                        nome,
                        salario,
                        codigo
                );

                // Adiciona no vetor
                vetor.adicionarPessoa(pessoa, i);

            } catch (NumberFormatException erro) {

                JOptionPane.showMessageDialog(null,
                        "Erro: Digite números válidos!");

                // Volta uma posição do laço
                i--;
            }
        }

        // Mostra todas as pessoas cadastradas
        vetor.exibirinformacoes();
    }
}