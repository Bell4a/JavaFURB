package models;

public class EntregaExpressa extends Entrega {
    
    @Override
    public double calcularFrete() {
        double frete = super.distancia * 2;
        return frete;
    }

}
