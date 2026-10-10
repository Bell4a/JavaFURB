package models;

public abstract class Veiculo {
    protected String modelo;
    protected double valor;

    public abstract double calcularImposto();

}
