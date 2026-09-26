package src.models;

public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente(String nome, int idade) {
        super(nome, idade);
        System.out.println("Contrutor Gerente");
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

    @Override 
    public double calcularAumento() {
        double aumento = salario * 5 / 100;
        return aumento;
    }
}
