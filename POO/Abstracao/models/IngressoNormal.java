package models;

public class IngressoNormal extends Ingresso {
    
    @Override
    public double calcularValor() {
        return super.ingressoBase;
    }
}
