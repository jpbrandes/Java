public class Principal {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", 10);
        Data d1 = new Data(1,1,2025);

        Cartao[] cartoes = new Cartao[5];

        cartoes[0] = new CartaoAniversario("João", "Maria", e1, d1);
        cartoes[1] = new CartaoAniversario("Ana", "Carlos", e1, d1);
        cartoes[2] = new CartaoNatal("Pedro", "Júlia", e1, d1);
        cartoes[3] = new CartaoAniversario("Lucas", "Fernada", e1, d1);
        cartoes[4] = new CartaoDianamorados("Marcos", "Paula", e1, d1);

        for (Cartao c : cartoes){
            c.mostrarMensagem();
            System.out.println("-----------------");
        }
    }
}
