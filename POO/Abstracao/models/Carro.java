package models;

public abstract class Carro extends Veiculo {
    
    @Override 
    public  double calcularImposto() {
        double imposto = super.valor * 4 / 100;
        return imposto;
    }

    @Override 
    public double calcularLocacao(int dias) {
        double locacao = (super.diariaLocacao * dias) + 50;
        return locacao;
    }

    public double calcularLocacao(int dias, double desconto) {
        double locacao = (super.diariaLocacao * dias) + 50 - desconto;
        return locacao;
    }
}
