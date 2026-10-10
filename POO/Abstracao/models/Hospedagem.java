package models;

public abstract class Hospedagem {
    protected double valorDiaria;

    public abstract double calcularValor(int dias);

}
