package models;

public class ProdutoImportado extends Produto {
    
    @Override 
    public double calcularPrecoFinal() {
        return super.preco + (super.preco * 20 / 100);
    }
}
