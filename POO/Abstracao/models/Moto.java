package models;

public abstract class Moto extends Veiculo {
    
    @Override 
    public  double calcularImposto() {
        double imposto = super.valor * 2 / 100;
        return imposto;
    }

    @Override 
    public double calcularLocacao(int dias) {
        double locacao = (super.diariaLocacao * dias) + 20;
        return locacao;
    }

}
