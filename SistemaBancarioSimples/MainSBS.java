public class MainSBS {
    public static void main(String[] args) { // Linha padrão para o método principal em Java
        ContaCorrenteSBS conta1 = new ContaCorrenteSBS("João Silva", 1000.00); // Criação de uma conta corrente com titular e saldo inicial
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo inicial: R$" + conta1.getSaldo()); // Concatenação de string para exibir o saldo inicial

        conta1.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta1.getSaldo());

        conta1.depositar(-200.00); // Teste de depósito inválido
        System.out.println("Saldo após depósito inválido: R$" + conta1.getSaldo());
        System.out.println("Saldo após saque: R$" + conta1.getSaldo());
    }
}