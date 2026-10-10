package models;

public class ContaGas extends ContaConsumo {
    
    @Override
    public double calcularValor() {
        return super.consumo * 7;
    }
}
