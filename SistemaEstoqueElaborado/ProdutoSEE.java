package SistemaEstoqueElaborado;

public class ProdutoSEE {
    private String nome;
    private String preco;
    private int quantidade;
    private DataSEE datavalidade; // Isso se chama composição, onde a classe ProdutoSEE tem um objeto da classe DataSEE como um de seus atributos.

    public ProdutoSEE(String nome, String preco, int quantidade, DataSEE datavalidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.datavalidade = datavalidade;
    }

    public ProdutoSEE(String nome, String preco, DataSEE datavalidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 10; // Quantidade padrão
        this.datavalidade = datavalidade;
    }

    public ProdutoSEE(String nome, DataSEE datavalidade) {
        this.nome = nome;
        this.preco = "100.00"; // Preço padrão
        this.quantidade = 10; // Quantidade padrão
        this.datavalidade = datavalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public DataSEE getDatavalidade() {
        return this.datavalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDatavalidade(DataSEE datavalidade) {
        this.datavalidade = datavalidade;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > 0 && quantidadeVendida <= this.quantidade) {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso! Quantidade vendida: " + quantidadeVendida);
        } else {
            System.out.println("Quantidade inválida para venda. Verifique a quantidade disponível.");
        }
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidade += quantidadeComprada;
            System.out.println("Compra realizada com sucesso! Quantidade comprada: " + quantidadeComprada);
        } else {
            System.out.println("Quantidade inválida para compra. A quantidade deve ser maior que zero.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade: " + getQuantidade() + "\nData de Validade: " + getDatavalidade();
        // Concatenção de strings para criar uma representação em string do objeto ProdutoSEE, incluindo o nome, preço, quantidade e data de validade.

    }
}

