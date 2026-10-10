package models;

public abstract class Entrega {
    protected double peso;
    protected double distancia;

    public abstract double calcularFrete();
}
