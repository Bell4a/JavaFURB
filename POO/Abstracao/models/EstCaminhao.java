package models;

public class EstCaminhao extends VeiculoEstacionamento {
    
    @Override 
    public double calcularValor() {
        double estacionamento = super.horasEstacionado * 10;
        return estacionamento;
    }
}
