package src.models;

public class Cliente {
    
    protected String nome;
    protected double valorCompra;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularDesconto() {
        double desconto = valorCompra * 5 / 100;
        return desconto;
    }
    
}
