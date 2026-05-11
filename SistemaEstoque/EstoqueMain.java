package SistemaEstoque;
public class EstoqueMain{
    public static void main (String args[]){
        Estoque estoque = new Estoque("Produto A", 10.0, 100);
        estoque.vender(90);
        estoque.compra(50);
        estoque.compra(30);
        estoque.reajustar(10);
        estoque.vender(20);
        System.out.println("Nome: " + estoque.getNome());
        System.out.println("Preço: " + estoque.getPreco());
        System.out.println("Quantidade: " + estoque.getQuantidade());
    }
}