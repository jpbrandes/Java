package SistemaEstoque;
private String nome;
    private double preco;
    private int quantidade;

    public Estoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades de " + nome + " realizada com sucesso.");
        } else {
            System.out.println("Quantidade de venda inválida ou estoque insuficiente.");
        }
    }

    public void compra(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Compra de " + quantidade + " unidades de " + nome + " realizadas com sucesso.");
        } else {
            System.out.println("Quantidade de compra inválida.");
        }
    }

    public void reajustar(double percentual) {
        if (percentual > 0) {
            this.preco += this.preco * percentual / 100;
            System.out.println("Preço de " + nome + " reajustado em " + percentual + "% com sucesso.");
        } else {
            System.out.println("Percentual de reajuste inválido.");
        }
    }
}
