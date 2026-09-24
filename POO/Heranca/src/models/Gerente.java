package src.models;

public class Gerente extends Funcionario {
    protected double bonus;

    public void Gerente() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalarioTotal() {
        double salarioTotal = salario + bonus;
        return salarioTotal;
    }

}
