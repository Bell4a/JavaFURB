package src.models;

public class ProdutoPromocional extends Produto{
    
    protected double percentualDesconto;

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ProdutoPromocional(String nome) {
        super(nome);
    }

    public ProdutoPromocional(String nome, double preco) {
        super(nome, preco);
    }
    
}
