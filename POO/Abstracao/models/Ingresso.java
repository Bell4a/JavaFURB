package models;

public abstract class Ingresso {
    protected String nomeEvento;
    protected double ingressoBase;

    public abstract double calcularValor();

}
