package models;

public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return super.salarioBase;
    }

    @Override 
    public double calcularBonus() {
        return super.salarioBase + super.bonus;
    }

}
