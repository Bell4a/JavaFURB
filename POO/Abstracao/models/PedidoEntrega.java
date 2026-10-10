package models;

public class PedidoEntrega extends Pedido {
    
    @Override 
    public double calcularTotal() {
        double total = super.valorProdutos + 15;
        return total;
    }
}
