package src.models;

public class ProdutoImportado extends Produto {
    protected double taxaImportacao;

    public ProdutoImportado() {
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularPrecoFinal() {
        double precoFinal = preco + taxaImportacao;
        return precoFinal;
    }
}
