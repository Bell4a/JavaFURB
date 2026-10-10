package models;

public abstract class Veiculo extends ItemLocacao {
    
    protected String modelo;
    protected double valor;

    public abstract double calcularImposto();
}
