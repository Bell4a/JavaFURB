public class ContaAgua implements Pagavel {
    private double metrosCubicos;
    private double precoMetroCubico;

    public ContaAgua(double metrosCubicos, double precoMetroCubico) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorPagar() {
        return this.metrosCubicos * this.precoMetroCubico;
    }

    public double getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(double metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    public void setPrecoMetroCubico(double precoMetroCubico) {
        this.precoMetroCubico = precoMetroCubico;
    }
}