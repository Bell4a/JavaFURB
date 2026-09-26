package src.models;

public class Moto extends VeiculoMotor {
    protected int cilindradas;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override 
    public double calcularValorLocacao(int dias) {
        double locacao = valorDiariaV * dias;
        return locacao;
    }
}
