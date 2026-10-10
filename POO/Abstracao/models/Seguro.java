package models;

public abstract class Seguro {
    protected String nomeSegurado;
    protected double valorBem;

    public abstract double calcularPremio();

}
