public class ContaCorrente {
    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar e sacar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso."); // Concatenação de string para exibir o valor depositado
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso."); // Concatenação de string para exibir o valor sacado
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}