package src.models;

public class Reserva {
    protected String nomeHospede;
    protected int quantiDiarias;
    protected double valorDiaria;

    public String getNomeHospede() {
        return nomeHospede;
    }
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }
    public int getQuantiDiarias() {
        return quantiDiarias;
    }
    public void setQuantiDiarias(int quantiDiarias) {
        this.quantiDiarias = quantiDiarias;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotal() {
        double diariaTotal = quantiDiarias * valorDiaria;
        return diariaTotal;
    }
}
