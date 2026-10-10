package models;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public abstract double calcularPrecoFinal();
}
