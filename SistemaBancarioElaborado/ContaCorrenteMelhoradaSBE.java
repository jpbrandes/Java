package SistemaBancarioElaborado;

public class ContaCorrenteMelhoradaSBE {
    private String nome;
    private int numero;
    private double saldo;
    private double limite;
    private int agencia;

    public ContaCorrenteMelhoradaSBE(String nome, double saldo, int numero, double limite, int agencia) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
        this.limite = limite;
        this.agencia = agencia;
    } // Construtor para inicializar os atributos da conta. O construtor serve para criar instâncias de uma classe.

    public ContaCorrenteMelhoradaSBE(String nome, double saldo, int numero, int agencia) { // A sobrecarga de construtores é uma técnica que permite criar múltiplos construtores com diferentes parâmetros.
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    } 

    public ContaCorrenteMelhoradaSBE(String nome, int numero, int agencia) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia; // Esse código possui três constrututores, para diferentes casos.
    }

    // Métodos getter para acessar os valores dos atributos.
    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }
    
    public int getAgencia() {
        return this.agencia;
    }

    // Métodos setter para atribuir valores aos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void atualizarSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void atualizarLimite(double limite) {
        this.limite = limite;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void atualizarNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void imprimirDados() {
        System.out.println("Titular: " + this.nome);
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Limite: R$" + this.limite);
    }

}
