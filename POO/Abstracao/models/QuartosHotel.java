package models;

public abstract class QuartosHotel {
    protected int numero;
    protected double valorDiaria;

    public abstract double calcularHospedagem(int dias);
    
}
