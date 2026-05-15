public class PrincipalOV {
    public static void main(String[] args) {
        int[] vetor1 = {50, 100, 150, 200, 250};
        int[] vetor2 = {5, 10, 15, 20, 25};
        int[] vetorSoma = OperacoesVetores.somaVetores(vetor1, vetor2);
        int[] vetorSubtracao = OperacoesVetores.subtracaoVetores(vetor1, vetor2);
        int[] vetorMultiplicacao = OperacoesVetores.multiplicacaoVetores(vetor1, vetor2);
        int[] vetorDivisao = OperacoesVetores.divisaoVetores(vetor1, vetor2);
        int[] vetorMedia = OperacoesVetores.mediaarimeticaVetores(vetor1, vetor2);

        System.out.println("Vetor 1: ");
        for (int i : vetor1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Vetor 2: ");
        for (int i : vetor2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Soma: ");
        for (int i : vetorSoma) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Subtração: ");
        for (int i : vetorSubtracao) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Multiplicação: ");
        for (int i : vetorMultiplicacao) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Divisão: ");
        for (int i : vetorDivisao) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Média Aritmética: ");
        for (int i : vetorMedia) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}