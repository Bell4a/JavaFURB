package models;

public class Vendedor extends Funcionario {
    
    public void registrarVenda(double valor) {

    }

    @Override
    public double calcularSalario() {
        return super.salarioBase;
    }

    @Override 
    public double calcularBonus() {
        return super.salarioBase + super.bonus;
    }
}
