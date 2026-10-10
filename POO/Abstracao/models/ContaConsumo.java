package models;

public abstract class ContaConsumo {
    protected String nomeCliente;
    protected double consumo;

    public abstract double calcularValor();

}
