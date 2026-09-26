package src.models;

public class PedidoExpress extends Pedido{
    protected double taxaUrgencia;

    public double getTaxaUrgencia() {
        return taxaUrgencia;
    }

    public void setTaxaUrgencia(double taxaUrgencia) {
        this.taxaUrgencia = taxaUrgencia;
    }
    
    public double calcularTotalProduto(double valorProdutos, double valorFrete) {
        var total = super.calcularTotalProduto();
        total = total + taxaUrgencia;
        return total;
    }
}
