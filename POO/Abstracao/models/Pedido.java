package models;

public abstract class Pedido {
    protected int numero;
    protected double valorProdutos;

    public abstract double calcularTotal();
}
