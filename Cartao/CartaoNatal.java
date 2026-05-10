public class CartaoNatal extends Cartao {
    public CartaoNatal(String destinatario, String remetente, Endereco endereco, Data data){
        super(destinatario, remetente, endereco, data);
    }

    @Override
    public String mensagem(){
        return "Feliz Natal!";
    }

}
