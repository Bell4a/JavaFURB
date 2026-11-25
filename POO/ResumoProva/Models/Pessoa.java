package Models;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    // Serializable : permite que os objetos sejam gravados em arquivos binários usando serialização
     private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
