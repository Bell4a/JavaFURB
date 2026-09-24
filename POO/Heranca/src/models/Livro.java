package src.models;

public class Livro {
    protected String titulo;
    protected String autor;
    protected double preco;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoDesconto(double desconto) {
        double precoDesconto = preco - (desconto * preco / 100);
        return precoDesconto;
    }
}
