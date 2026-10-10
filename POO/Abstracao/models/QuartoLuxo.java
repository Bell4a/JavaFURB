package models;

public class QuartoLuxo extends QuartosHotel {
    
    @Override 
    public double calcularHospedagem(int dias) {
        double diaria = super.valorDiaria * dias;
        return diaria;
    }
}
