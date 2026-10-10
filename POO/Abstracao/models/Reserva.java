package models;

public abstract class Reserva {
    protected String nome;
    protected double salarioBase;

    public abstract double calcularBonus();

}
