public class Aluguel {
    private int qtdDias;
    private int qtdPassageiros;
    private double valorDiaria;

    public Aluguel() {
        this.valorDiaria = 150.00;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        if (qtdDias <= 0) {
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.qtdDias = qtdDias;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        if (qtdPassageiros <= 0) {
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.qtdPassageiros = qtdPassageiros;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularValorAluguel() {
        double valorTotal = qtdDias * valorDiaria;
        
        if (qtdPassageiros > 4) {
            int passageirosExcedentes = qtdPassageiros - 4;
            double adicionalExcedente = passageirosExcedentes * 20.00 * qtdDias;
            valorTotal += adicionalExcedente;
        }
        
        return valorTotal;
    }
}