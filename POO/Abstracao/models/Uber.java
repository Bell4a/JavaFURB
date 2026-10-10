package models;

public class Uber extends Transporte {
    
    @Override 
    public double calcularCusto() {
        double custo = super.distanciaKm * 2;
        return custo;
    }
}
