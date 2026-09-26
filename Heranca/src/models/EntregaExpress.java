package src.models;

public class EntregaExpress extends Entrega {
    
    public double calcularFrete(double distanciaKm) {
        var frete = super.calcularFrete();
        frete = frete + 20;
        return frete;
    }
}
