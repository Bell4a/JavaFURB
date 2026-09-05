package Array.classes;

import java.util.ArrayList;

public class Projeto {
    private int codigo;
    private String nome;
    private double orcamento;
    private ArrayList<Desenvolvedor> desenvolvedores;

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
    public double getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
    public ArrayList<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }
    public void setDesenvolvedores(ArrayList<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
}
