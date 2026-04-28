public class Principal {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 300.0, 10); // Criação do objeto
        teclado.aplicarDesconto(20); // Chamar os métodos
        teclado.vender(4);
        teclado.vender(8);
        System.out.println(teclado.getPreco()); // Mostrar com os getters
        System.out.println(teclado.getEstoque());
    }
}
