package src.models;

public class VeiculoMotor extends Veiculo {
    protected String motor;

    public VeiculoMotor(String marca, String modelo) {
        super(marca, modelo);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override 
    public double calcularValorLocacao(int dias) {
        double locacao = valorDiariaV * dias;
        return locacao;
    }
}
