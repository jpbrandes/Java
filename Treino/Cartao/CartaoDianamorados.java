public class CartaoDianamorados extends Cartao {
    public CartaoDianamorados(String destinatario, String remetente, Endereco endereco, Data data){
        super(destinatario, remetente, endereco, data);
    }

    @Override
    public String mensagem(){
        return "Feliz Dia dos Namorados!";
    }
}

// Comentário de teste
