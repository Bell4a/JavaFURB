package Array.classes;

import java.util.ArrayList;

public class Pessoa {
    
    private int cpf;
    private String nome;
    private int dataNascimento;
    private ArrayList<Automovel> automoveis;
    
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
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }
    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    
}