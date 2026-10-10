package models;

public class Casa extends Imovel {
    
    @Override 
    public double calcularValorVenda() {
        double valorVenda = super.valorBase + 30000;
        return valorVenda;
    }
}
