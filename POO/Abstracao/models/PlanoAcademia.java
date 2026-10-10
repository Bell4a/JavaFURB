package models;

public abstract class PlanoAcademia {
    protected String nomeCliente;
    protected double valorBase;

    public abstract double calcularMensalidade();

}
