package src.models;

public class Pedido {
    protected int numero;
    protected double valorProdutos;
    protected double valorFrete;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getValorProdutos() {
        return valorProdutos;
    }
    public void setValorProdutos(double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }
    public double getValorFrete() {
        return valorFrete;
    }
    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double calcularTotalProduto() {
        double total = valorProdutos + valorFrete;
        return total;
    }
    
}
