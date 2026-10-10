package models;

public class Onibus extends Transporte {
    
    @Override 
    public double calcularCusto() {
        double custo = super.distanciaKm * 5.50;
        return custo;
    }
}
