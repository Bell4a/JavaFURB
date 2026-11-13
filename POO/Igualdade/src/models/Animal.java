package models;

import java.util.Objects;

public class Animal implements Identificavel {
    private int identificacao;
    private String nome;

    public Animal(int identificacao, String nome) {
        this.identificacao = identificacao;
        this.nome = nome;
    }

    @Override
    public String getIdentificacao() {
        return String.valueOf(identificacao);
    }

    public int getIdNumerica() { return identificacao; }
    public void setIdentificacao(int identificacao) { this.identificacao = identificacao; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return identificacao == animal.identificacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacao);
    }
}