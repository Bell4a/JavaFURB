package models;

public class Taxi extends Transporte {

    @Override 
    public double calcularCusto() {
        double custo = 6 + (super.distanciaKm * 2.5);
        return custo;
    }
}
