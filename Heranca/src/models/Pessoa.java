package src.models;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Contrutor Pessoa");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
