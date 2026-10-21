package models;

public class TesouroDireto implements Ativo {
    private double valor;
    private double rentabilidade;

    public TesouroDireto(double valor, double rentabilidade) {
        setValor(valor);
        setRentabilidade(rentabilidade);
    }

    @Override
    public double calcularRendimento() {
        // O rendimento representa a porcentagem anual sobre o valor investido
        return this.valor * (this.rentabilidade / 100.0);
    }

    @Override
    public double calcularValorInvestido() {
        return this.valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor está incorreto");
        }
        this.valor = valor;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        if (rentabilidade <= 0) {
            throw new IllegalArgumentException("Valor para o campo rentabilidade está incorreto");
        }
        this.rentabilidade = rentabilidade;
    }
}
