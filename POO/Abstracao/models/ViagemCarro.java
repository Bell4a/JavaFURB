package models;

public class ViagemCarro extends Viagem {
    
    @Override 
    public double calcularCusto() {
        double custo = distViagem * 0.80;
        return custo;
    }
}
