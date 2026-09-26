package src.models;

public class ReservaEspecial extends Reserva {
    
    protected double servicoExtra;

    public double getServicoExtra() {
        return servicoExtra;
    }

    public void setServicoExtra(double servicoExtra) {
        this.servicoExtra = servicoExtra;
    }

    public double calcularTotal(double valorDiaria, double quantiDiarias) {
        var diariaTotal = super.calcularTotal();
        diariaTotal = diariaTotal + servicoExtra;
        return diariaTotal;
    }
}
