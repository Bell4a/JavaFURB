package Array.classes;

import java.util.ArrayList;

public class Paciente {
    private int cpf;
    private String nome;
    private int telefone;
    private ArrayList<Medico> medicos;

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    
}
