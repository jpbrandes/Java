package SistemaBancarioElaborado;

public class MainSBE {
    public static void main(String[] args) {
        ContaCorrenteMelhoradaSBE[] conta = new ContaCorrenteMelhoradaSBE[5];
        conta[0] = new ContaCorrenteMelhoradaSBE("João Silva", 1000.00, 12345, 500.00, 1);
        conta[1] = new ContaCorrenteMelhoradaSBE("Maria Oliveira", 1500.00, 12345, 500.00, 1);
        conta[2] = new ContaCorrenteMelhoradaSBE("Carlos Santos", 2000.00, 12346, 500.00, 1);
        conta[3] = new ContaCorrenteMelhoradaSBE("Ana Costa", 2500.00, 12347, 500.00, 1);
        conta[4] = new ContaCorrenteMelhoradaSBE("Pedro Almeida", 3000.00, 67890, 1000.00, 2);

        System.out.println("Titular: " + conta[0].getNome());
        System.out.println("Número da conta: " + conta[0].getNumero());
        System.out.println("Saldo: R$" + conta[0].getSaldo());
        System.out.println("Limite: R$" + conta[0].getLimite());
        System.out.println("Agência: " + conta[0].getAgencia());

        System.out.println("\nTitular: " + conta[1].getNome());
        System.out.println("Número da conta: " + conta[1].getNumero());
        System.out.println("Saldo: R$" + conta[1].getSaldo()); 
        System.out.println("Limite: R$" + conta[1].getLimite());
        System.out.println("Agência: " + conta[1].getAgencia());

        System.out.println("\nTitular: " + conta[2].getNome());
        System.out.println("Número da conta: " + conta[2].getNumero());
        System.out.println("Saldo: R$" + conta[2].getSaldo());
        System.out.println("Limite: R$" + conta[2].getLimite());
        System.out.println("Agência: " + conta[2].getAgencia());

        System.out.println("\nTitular: " + conta[3].getNome());
        System.out.println("Número da conta: " + conta[3].getNumero());
        System.out.println("Saldo: R$" + conta[3].getSaldo());
        System.out.println("Limite: R$" + conta[3].getLimite());
        System.out.println("Agência: " + conta[3].getAgencia());

        System.out.println("\nTitular: " + conta[4].getNome());
        System.out.println("Número da conta: " + conta[4].getNumero());
        System.out.println("Saldo: R$" + conta[4].getSaldo());
        System.out.println("Limite: R$" + conta[4].getLimite());
        System.out.println("Agência: " + conta[4].getAgencia());
    }
}

