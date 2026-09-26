package src.models;

public class Energia {
    
    protected String tituar;
    protected double consumo;

    public double calcularValor() {
        double consumoTotal = consumo * 0.50;
        return consumoTotal;
    }
}
