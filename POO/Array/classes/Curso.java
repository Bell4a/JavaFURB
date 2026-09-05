package Array.classes;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Disciplina> disciplinas;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
