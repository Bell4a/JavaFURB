package models;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override 
    public double calcularBonus() {
        double bonus = super.salarioBase * 10 / 100;
        return bonus;
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
    
}
