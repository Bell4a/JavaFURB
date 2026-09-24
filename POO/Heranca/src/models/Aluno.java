package src.models;

public class Aluno extends Pessoa {
    protected int matricula;

    public Aluno(String nome) {
        super(nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
