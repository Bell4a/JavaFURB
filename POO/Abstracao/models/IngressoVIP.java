package models;

public class IngressoVIP extends Ingresso {
    
    @Override
    public double calcularValor() {
        return super.ingressoBase + (super.ingressoBase * 50 / 100);
    }
}
