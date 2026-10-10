package models;

public class ContaAgua extends ContaConsumo{
    
    @Override
    public double calcularValor() {
        return super.consumo * 4;
    }
}
