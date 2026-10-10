package models;

public abstract class Pagamento {
    
    protected double valor;

    public abstract double calcularValorFinal();
    
}
