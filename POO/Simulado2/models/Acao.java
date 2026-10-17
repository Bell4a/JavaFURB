package models;

public class Acao implements Ativo {
    public int qtdCota;
    public double valorCota;
    public double dividendo;

    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        this.qtdCota = qtdCota;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    @Override 
    public double calcularRendimento(){

    }

    @Override 
    public double calcularValorInvestido() {

    }
}
