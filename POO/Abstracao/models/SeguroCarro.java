package models;

public class SeguroCarro extends Seguro {

    @Override 
    public double calcularPremio() {
        double premio = super.valorBem * 5 / 100;
        return premio;
    }

}
