package models;

public class PagamentoPix extends Pagamento {
    
    @Override
    public double calcularValorFinal(){
        double desconto = super. valor - (super.valor * 5 / 100);
        return desconto;
    }
}
