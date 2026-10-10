package models;

public abstract class Curso {
    protected String nome;
    protected double cargaHoraria;

    public abstract double calcularMensalidade();

}
