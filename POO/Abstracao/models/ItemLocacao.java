package models;

import org.w3c.dom.Text;

public abstract class ItemLocacao {
    protected int codigo;
    protected Text descricao;
    protected double diariaLocacao;

    public abstract double calcularLocacao(int dias);

}
