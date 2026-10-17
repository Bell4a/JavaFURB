package models;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected double bonus;

    public abstract double calcularSalario();

    public abstract double calcularBonus();
}
