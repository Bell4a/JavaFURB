package models;

public abstract class Colaborador {
    protected String nome;
    protected double salarioBase;
    
    public Colaborador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

}
