package models;

public class EstMoto extends VeiculoEstacionamento {
    
    @Override 
    public double calcularValor() {
        double estacionamento = super.horasEstacionado * 3;
        return estacionamento;
    }
}
