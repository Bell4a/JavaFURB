package models;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override 
    public double calcularBonus() {
        double bonus = super.salarioBase * 20 / 100;
        return bonus;
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
}
