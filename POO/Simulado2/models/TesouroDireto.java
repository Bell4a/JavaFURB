package models;

public class TesouroDireto implements Ativo {
    public double valor;
    public double rentabilidade;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override 
    public double calcularRendimento(){

    }

    @Override 
    public double calcularValorInvestido() {

    }
}
