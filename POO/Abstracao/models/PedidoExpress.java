package models;

public class PedidoExpress extends Pedido {
    
    @Override 
    public double calcularTotal() {
        double total = super.valorProdutos + 30;
        return total;
    }

}
