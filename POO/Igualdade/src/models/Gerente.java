package models;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(int matricula, String nome, double salario, double bonus) {
        super(matricula, nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
}