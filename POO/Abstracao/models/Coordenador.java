package models;

public abstract class Coordenador extends Colaborador {
    
    @Override 
    public double calcularSalarioFinal() {
        double adicional = super.salarioBase + (super.salarioBase * 20 / 100);
        return adicional;
    }
}
