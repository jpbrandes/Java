package SistemaEstoqueElaborado;

public class PrincipalSEE {
    public static void main(String[] args) {
        DataSEE data1 = new DataSEE(15, 8, 2029);
        DataSEE data2 = new DataSEE(12, 9, 2028);
        DataSEE data3 = new DataSEE(10, 10, 2029);
        ProdutoSEE produto1 = new ProdutoSEE("Arroz", "20.00", 50, data1);
        ProdutoSEE produto2 = new ProdutoSEE("Feijão", "10.00", data2);
        ProdutoSEE produto3 = new ProdutoSEE("Macarrão", data3);
        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade: " + produto1.getQuantidade());
        System.out.println("Data de Validade: " + produto1.getDatavalidade());
        System.out.println("-----------------------------");
        System.out.println("Produto: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Quantidade: " + produto2.getQuantidade());
        System.out.println("Data de Validade: " + produto2.getDatavalidade());
        System.out.println("------------------------------");
        System.out.println("Produto: " + produto3.getNome());
        System.out.println("Preço: " + produto3.getPreco());
        System.out.println("Quantidade: " + produto3.getQuantidade());
        System.out.println("Data de Validade: " + produto3.getDatavalidade());
        System.out.println("------------------------------");
        System.out.println("Produto: " + produto3.getNome());
        System.out.println("Preço: " + produto3.getPreco());
        System.out.println("Quantidade: " + produto3.getQuantidade());
        System.out.println("Data de Validade: " + produto3.getDatavalidade());
    }
}
