package models;

public class SeguroCelular extends Seguro {
    
    @Override 
    public double calcularPremio() {
        double premio = super.valorBem * 8 / 100;
        return premio;
    }
}
