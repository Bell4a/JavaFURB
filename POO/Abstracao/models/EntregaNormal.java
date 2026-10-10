package models;

public class EntregaNormal extends Entrega {
    
    @Override 
    public double calcularFrete() {
        double frete = super.distancia * 3.50 + 10;
        return frete;
    }
}
