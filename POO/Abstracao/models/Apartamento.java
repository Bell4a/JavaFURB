package models;

public class Apartamento extends Imovel {
    
    @Override 
    public double calcularValorVenda() {
        double valorVenda = super.valorBase + (10 * super.valorBase / 100);
        return valorVenda;
    }

}
