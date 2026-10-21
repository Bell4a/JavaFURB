public class ContaLuz implements Pagavel {
    private double kwhHora;
    private double precoKwhHora;

    public ContaLuz(double kwhHora, double precoKwhHora) {
        this.kwhHora = kwhHora;
        this.precoKwhHora = precoKwhHora;
    }

    @Override
    public double calcularValorPagar() {
        return this.kwhHora * this.precoKwhHora;
    }

    public double getKwhHora() {
        return kwhHora;
    }

    public void setKwhHora(double kwhHora) {
        this.kwhHora = kwhHora;
    }

    public double getPrecoKwhHora() {
        return precoKwhHora;
    }

    public void setPrecoKwhHora(double precoKwhHora) {
        this.precoKwhHora = precoKwhHora;
    }
}