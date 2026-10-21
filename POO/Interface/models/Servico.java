public class Servico implements Descontavel {
    private double valorHora;
    private int quantidadeHoras;
    private double percentualDesconto;

    public Servico(double valorHora, int quantidadeHoras, double percentualDesconto) {
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto() {
        // O serviço calcula o desconto sobre o valor total das horas[cite: 7]
        double valorTotalHoras = this.valorHora * this.quantidadeHoras;
        return valorTotalHoras * (this.percentualDesconto / 100.0);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}