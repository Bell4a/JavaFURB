package src.models;

public class Animal {
    protected String cor;
    protected int idade;
    protected String nome;
    protected double tamanho;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
