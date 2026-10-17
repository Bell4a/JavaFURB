package models;

public class Consultor extends Funcionario {
    
    @Override
    public double calcularSalario() {
        return super.salarioBase;
    }

    @Override 
    public double calcularBonus() {
        return super.salarioBase + super.bonus;
    }
}
