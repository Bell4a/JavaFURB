package models;

public class ViagemOnibus extends Viagem {
    
    @Override 
    public double calcularCusto() {
        double custo = (distViagem * 0.30) * qntPassageiros;
        return custo;
    }
}
