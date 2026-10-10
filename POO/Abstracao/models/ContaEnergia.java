package models;

public class ContaEnergia extends ContaConsumo {
    
    @Override
    public double calcularValor() {
        return super.consumo * 0.9;
    }
}
