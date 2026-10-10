package models;

public class Mensalista extends Funcionario {

    public Mensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override 
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public double calcularBonus() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularBonus'");
    }
    
}
