package models;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public abstract double calcularSalario();

    public abstract double calcularBonus();
}