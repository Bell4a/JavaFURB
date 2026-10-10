package models;

public abstract class VeiculoEstacionamento {
    protected String placa;
    protected double horasEstacionado;

    public abstract double calcularValor();

}
