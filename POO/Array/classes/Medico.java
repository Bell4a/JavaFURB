package Array.classes;

import java.util.ArrayList;

public class Medico {
    private String crm;
    private String nome;
    private String especialidade;
    private ArrayList<Paciente> pacientes;
    
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    
}
