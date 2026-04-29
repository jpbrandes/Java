public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setDia(int dia){
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
	}

	public void setMes(int mes){
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		}
	}

	public void setAno(int ano){
		this.ano = ano;
	}
	
	@Override
	public String toString(){
		return getDia() + "/" +  getMes() + "/" + getAno();
		}
}
