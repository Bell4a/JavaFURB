package models;

public class IngressoMeia extends Ingresso {
    
    @Override
    public double calcularValor() {
        return super.ingressoBase / 2;
    }
}
