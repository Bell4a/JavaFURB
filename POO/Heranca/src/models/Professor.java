package src.models;

public class Professor extends Pessoa {
    protected double salario;
    protected String disciplina;

    public Professor() {
        super();
    } 

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    
}
