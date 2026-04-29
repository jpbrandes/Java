public class Endereco {
	private String rua;
	private int numcasa;
	private String nomecidade;

	public Endereco (String rua, int numcasa, String nomecidade){
		this.rua = rua;
		this.numcasa = numcasa;
		this.nomecidade = nomecidade;
	}

	public Endereco (String rua, int numcasa){
		this.rua = rua;
		this.numcasa = numcasa;
		this.nomecidade = null;
	}

	// Métodos Getters
	public String getRua(){
		return this.rua;
	}

	public int getNumcasa(){
		return this.numcasa;
	}

	public String getNomecidade(){
		return this.nomecidade;
	}

	// Métodos Setters
	public void setRua(String rua){
		this.rua = rua;
	}

	public void setNumcasa(int numcasa){
		this.numcasa = numcasa;
	}

	public void setNomecidade(String nomecidade) {
		this.nomecidade = nomecidade;
	}

	@Override
	public String toString(){
		return "Endereço: " + getRua() + ", " +  getNumcasa() + ", " + getNomecidade() + ".";
		}
}
