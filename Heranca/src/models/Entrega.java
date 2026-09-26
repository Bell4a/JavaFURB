package src.models;

public class Entrega {
    
    protected double distanciaKm;

    public double calcularFrete() {
        double frete = distanciaKm * 2;
        return frete;
    }
}
