public class CartaoAniversario extends Cartao {
    public CartaoAniversario (String destinatario, String remetente, Endereco endereco, Data data){
        super(destinatario, remetente, endereco, data);
    }

    @Override
    public String mensagem(){
        return ("Feliz Aniversário");
    }
}
