package models;

public abstract class Entrega {
    protected double distancia;
    protected double peso;

    public abstract double calcularFrete();
}
