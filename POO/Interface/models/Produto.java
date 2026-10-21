public class Produto implements Descontavel {
    private double preco;
    private double percentualDesconto;

    public Produto(double preco, double percentualDesconto) {
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto() {
        // O produto calcula o desconto sobre o seu preço
        return this.preco * (this.percentualDesconto / 100.0);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}