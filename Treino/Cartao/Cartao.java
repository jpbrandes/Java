public abstract class Cartao {
	private String destinatario;
	private String remetente;
	private Endereco endereco;
	private Data data;

	public Cartao (String destinatario, String remetente, Endereco endereco, Data data){
		this.destinatario = destinatario;
		this.remetente = remetente;
		this.endereco = endereco;
		this.data = data;
	}

	public String getDestinatario(){
		return this.destinatario;
	}

	public String getRemetente(){
		return this.remetente;
	}

	public Endereco getEndereco(){
		return this.endereco;
	}

	public Data getData(){
		return this.data;
	}
}
