package models;

public abstract class Bicicleta extends Veiculo {
    
    @Override 
    public double calcularLocacao(int dias) {
        double locacao = super.diariaLocacao * dias;
        return locacao;
    }

}
