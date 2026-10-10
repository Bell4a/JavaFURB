package models;

public class ProdutoNacional extends Produto {
    
    @Override
    public double calcularPrecoFinal() {
        return super.preco;
    }
}
