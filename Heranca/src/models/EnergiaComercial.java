package src.models;

public class EnergiaComercial extends Energia {
    
    @Override 
    public double calcularValor() {
        double consumoTotal = consumo * 0.75;
        return consumoTotal;
    }
}
