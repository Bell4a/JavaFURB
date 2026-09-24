package src.models;

public class Vendedor extends Empregado {
    protected int totalVendas;
    protected double percentualComissao;

    public int getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalario() {
        double salarioComissao = salarioBase + (salarioBase * percentualComissao / 100);
        return salarioComissao;
    }
}
