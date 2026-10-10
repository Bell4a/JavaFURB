package models;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected int ano;

    public abstract int calcularPrazoEmprestimo();

}
