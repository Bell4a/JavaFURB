package src.models;

public class ClientePremium extends Cliente {
    
    @Override
    public double calcularDesconto() {
        double desconto = valorCompra * 10 / 100;
        return desconto;
    }
}
