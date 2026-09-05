package Array.classes;

import java.util.ArrayList;

public class Desenvolvedor {
    private int matricula;
    private String nome;
    private String linguagemPrincipal;
    private ArrayList<Projeto> projetos;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    
}
