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

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getRemetente(){
		return this.remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public Endereco getEndereco(){
		return this.endereco;
	}

	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	public Data getData(){
		return this.data;
	}

	public void setData(Data data){
		this.data = data;
	}


	public void mostrarMensagem(){
		System.out.println("Para: " + destinatario);
		System.out.println("De: " + remetente);
		System.out.println("Endereço: " + endereco);
		System.out.println("Data: " + data);
		System.out.println("Mensagem: " + mensagem());
	}

	public abstract String mensagem();

}
