package models;

public abstract class ContaBancaria {
    
    protected int numero;
    protected double saldo;

    public abstract void sacar(double valor);
}
