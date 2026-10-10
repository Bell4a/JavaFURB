package models;

public class QuartoSimples extends QuartosHotel {
    
    @Override 
    public double calcularHospedagem(int dias) {
        double diaria = (super.valorDiaria * dias) + 100;
        return diaria;
    }
}
