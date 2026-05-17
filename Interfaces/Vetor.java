package Interfaces;

import javax.swing.JOptionPane;

public class Vetor {

    private Pessoa[] ObjetosPessoa;

    // Construtor
    public Vetor(int tamanho) {
        ObjetosPessoa = new Pessoa[tamanho];
    }

    // Adicionar pessoa
    public void adicionarPessoa(Pessoa pessoa, int posicao) {

        if (posicao >= 0 && posicao < ObjetosPessoa.length) {

            ObjetosPessoa[posicao] = pessoa;

        } else {

            JOptionPane.showMessageDialog(null,
                    "Posição inválida!");
        }
    }

    // Buscar pessoa
    public Pessoa getPessoa(int posicao) {

        if (posicao >= 0 && posicao < ObjetosPessoa.length) {

            return ObjetosPessoa[posicao];

        } else {

            JOptionPane.showMessageDialog(null,
                    "Posição inválida!");

            return null;
        }
    }

    // Exibir informações
    public void exibirinformacoes() {

        String texto = "";

        for (int i = 0; i < ObjetosPessoa.length; i++) {

            if (ObjetosPessoa[i] != null) {

                texto += "Posição " + i + "\n";
                texto += ObjetosPessoa[i].toString();
                texto += "\n\n";

            } else {

                texto += "Posição " + i + ": Vazia\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}