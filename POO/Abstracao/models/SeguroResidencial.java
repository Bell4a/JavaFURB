package models;

public class SeguroResidencial extends Seguro {
    
    @Override 
    public double calcularPremio() {
        double premio = super.valorBem * 2 / 100;
        return premio;
    }
}
