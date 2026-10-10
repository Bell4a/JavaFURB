package models;

public class Analista extends Colaborador {

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override 
    public double calcularSalarioFinal() {
        double adicional = super.salarioBase + (super.salarioBase * 10 / 100);
        return adicional;
    }
}
