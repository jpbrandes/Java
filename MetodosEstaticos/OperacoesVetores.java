public class OperacoesVetores {
    int vetor1[], vetor2[];
    public OperacoesVetores(int vetor1[], int vetor2[]) {
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;
    }

    public static int[] somaVetores(int vetor1[], int vetor2[]) {
        int vetorSoma[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        return vetorSoma;
    }

    public static int[] subtracaoVetores(int vetor1[], int vetor2[]) {
        int vetorSubtracao[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorSubtracao[i] = vetor1[i] - vetor2[i];
        }
        return vetorSubtracao;
    }

    public static int[] multiplicacaoVetores(int vetor1[], int vetor2[]) {
        int vetorMultiplicacao[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorMultiplicacao[i] = vetor1[i] * vetor2[i];
        }
        return vetorMultiplicacao;
    }

    public static int[] divisaoVetores(int vetor1[], int vetor2[]) {
        int vetorDivisao[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor2[i] != 0) {
                vetorDivisao[i] = vetor1[i] / vetor2[i];
            } else {
                System.out.println("Divisão por zero no índice " + i);
                vetorDivisao[i] = 0; // ou algum valor padrão
            }
        }
        return vetorDivisao;
    }

    public static int[] mediaarimeticaVetores(int vetor1[], int vetor2[]) {
        int vetorMedia[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorMedia[i] = (vetor1[i] + vetor2[i]) / 2;
        }
        return vetorMedia;
    }

    public static int[] exibirVetores(int vetor1[], int vetor2[]) {
        int vetorExibir[] = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorExibir[i] = vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            vetorExibir[i] = vetor2[i];
        }
        return vetorExibir;
    }

    public static int[] buscaSequencial(int vetor[], int valor) {
        int resultado[] = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                resultado[i] = i; // Retorna o índice onde o valor foi encontrado
            } else {
                resultado[i] = -1; // Indica que o valor não foi encontrado
            }
        }
        return resultado;
    }
} 
        