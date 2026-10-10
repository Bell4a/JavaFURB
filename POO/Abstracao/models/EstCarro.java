package models;

public class EstCarro extends VeiculoEstacionamento {
    
    @Override 
    public double calcularValor() {
        double estacionamento = super.horasEstacionado * 5;
        return estacionamento;
    }

}
