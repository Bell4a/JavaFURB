package models;

public class Acao implements Ativo {
    private int qtdCota;
    private double valorCota;
    private double dividendo;

    public Acao(int qtdCota, double valorCota, double dividendo) {
        setQtdCota(qtdCota);
        setValorCota(valorCota);
        setDividendo(dividendo);
    }

    @Override
    public double calcularRendimento() {
        // O total de dividendos recebidos é a quantidade de cotas multiplicado pelo valor do dividendo
        return this.qtdCota * this.dividendo;
    }

    @Override
    public double calcularValorInvestido() {
        // O valor total investido é a quantidade de cotas multiplicado pelo valor de uma cota
        return this.qtdCota * this.valorCota;
    }

    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        if (qtdCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo qtdCota está incorreto");
        }
        this.qtdCota = qtdCota;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        if (valorCota <= 0) {
            throw new IllegalArgumentException("Valor para o campo valorCota está incorreto");
        }
        this.valorCota = valorCota;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        if (dividendo <= 0) {
            throw new IllegalArgumentException("Valor para o campo dividendo está incorreto");
        }
        this.dividendo = dividendo;
    }
}
