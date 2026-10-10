package models;

public abstract class Viagem {
    protected double distViagem;
    protected int qntPassageiros;

    public abstract double calcularCusto();

}
