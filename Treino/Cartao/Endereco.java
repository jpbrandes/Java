public class Endereco {
	private String rua;
	private int numcasa;
	private String nomecidade;

	public Endereco (String rua, int numcasa, String nomecidade){
		this.rua = rua;
		this.numcasa = numcasa;
		this.nomecidade = nomecidade;
	}

	public String getRua(){
		return this.rua;
	}

	public int getNumcasa(){
		return this.numcasa;
	}

	public String getNomecidade(){
		return this.nomecidade;
	}

	@Override
	public String toString(){
		return "Endereço: " + getRua() + ", " +  getNumcasa() + ", " + getNomecidade() + ".";
		}
}
