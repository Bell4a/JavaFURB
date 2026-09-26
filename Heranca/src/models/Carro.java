package src.models;

public class Carro extends VeiculoMotor{
    protected int portas;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override 
    public double calcularValorLocacao(int dias) {
        double locacao = valorDiariaV * dias;
        return locacao;
    }
}
