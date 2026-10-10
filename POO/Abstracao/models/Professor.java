package models;

public abstract class Professor {
    protected String nome;
    protected double valorHora;

    public abstract double calcularSalario(int qntHoras);
}
