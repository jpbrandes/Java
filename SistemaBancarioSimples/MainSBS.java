public class MainSBS {
    public static void main(String[] args) {
        ContaCorrenteSBS conta1 = new ContaCorrenteSBS("João Silva", 1000.00);
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo inicial: R$" + conta1.getSaldo());

        conta1.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta1.getSaldo());

        conta1.depositar(-200.00); // Teste de depósito inválido
    }
}