package models;

public abstract class Diretor extends Colaborador {
    
    
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override 
    public double calcularSalarioFinal() {
        double adicional = super.salarioBase + (super.salarioBase * 30 / 100);
        return adicional;
    }
}
