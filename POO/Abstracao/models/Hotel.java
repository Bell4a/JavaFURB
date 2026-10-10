package models;

public class Hotel extends Hospedagem {
    
    @Override
    public double calcularValor(int dias) {
        double diaria = dias * super.valorDiaria;
        return diaria;
    }

    public double calcularValor(int dias, double desconto) {
        double diaria = (dias * super.valorDiaria) - desconto;
        return diaria;
    }

}
