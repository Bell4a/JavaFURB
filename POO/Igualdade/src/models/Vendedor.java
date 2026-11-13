package models;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(int matricula, String nome, double salario, double comissao) {
        super(matricula, nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }
}