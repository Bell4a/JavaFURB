package src.models;

public class Funcionario extends Pessoa{
    protected  double salario;
    

    public Funcionario(String nome, int idade) {
        super(nome, idade);
        System.out.println("Construtor Funcionário");
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularAumento() {
        double aumento = salario * 5 / 100;
        return aumento;
    }
}
