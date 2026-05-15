package SistemaCadastro;

public class DataSC {
    private int dia;
    private int mes;
    private int ano;

    public DataSC(int dia, int mes, int ano) {
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

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. O dia deve estar entre 1 e 31.");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O mês deve estar entre 1 e 12.");
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. O ano deve ser um valor positivo.");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}
