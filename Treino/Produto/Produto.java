public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque; // Construtor afirma que nome e saldo representam de forma literal o que é o que.
    }

    public String getNome(){ // Getters recebem o nome do meu atributo. 
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }
    
    public void setNome(String nome){ // Setters disponibilizam um valor para um atributo.
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public void aplicarDesconto(double percentual) { // Métodos, são ações ou comportamentos desse objeto.
        preco = preco - (preco * percentual / 100);
    }

    public void vender(int quantidade){
        if (quantidade <= estoque){
            estoque = estoque - quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
