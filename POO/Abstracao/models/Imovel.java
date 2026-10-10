package models;

public abstract class Imovel {
    protected String endereco;
    protected double valorBase;

    public abstract double calcularValorVenda();
}
