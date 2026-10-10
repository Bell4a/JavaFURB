package models;

public class Horista extends Funcionario {

    protected double horasTrabalhadas;
    protected double valorHora;

    public Horista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override 
    public double calcularSalario(){
        double salario = horasTrabalhadas * valorHora;
        return salario;
    }

    @Override
    public double calcularBonus() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularBonus'");
    }
}
