package models;

public class ViagemAviao extends Viagem {
    
    @Override 
    public double calcularCusto() {
        double custo = (distViagem * 0.70) * qntPassageiros;
        return custo;
    }
}
