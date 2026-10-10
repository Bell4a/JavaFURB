package models;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public abstract double calcularBonus();

    public double calcularSalarioBonus(double salarioBase) {
        double salarioBonus = this.calcularBonus() + this.calcularSalario();
        return salarioBonus;    
    }
    
}
