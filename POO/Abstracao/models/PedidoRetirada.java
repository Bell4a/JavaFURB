package models;

public class PedidoRetirada extends Pedido {
    
    @Override 
    public double calcularTotal() {
        return super.valorProdutos;
    }

}
