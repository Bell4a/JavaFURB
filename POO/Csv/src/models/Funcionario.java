package models;

public class Funcionario {
    private int matricula;
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(int matricula, String nome, String departamento, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + " | Nome: " + nome + " | Dept: " + departamento + " | Salário: R$ " + String.format("%.2f", salario);
    }
}