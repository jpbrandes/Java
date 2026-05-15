package SistemaEstoqueElaborado;

public class DataSEE {
    public int dia;
    public int mes;
    public int ano;

    public DataSEE(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public DataSEE(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = 2026; // Ano padrão
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
        if (mes >= 1 && mes <= 12) { // Adicionado a validação de dia e mês.
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O mês deve estar entre 1 e 12.");
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override 
    public String toString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}


/* Isso acima é um override, um override serve para sobrescrever um método da classe pai, nesse caso o método toString() da classe Object, que é a classe pai de todas as classes em Java. 
O método toString() é usado para retornar uma representação em string do objeto, e aqui estamos sobrescrevendo ele para retornar a data no formato "dd/MM/yyyy". */