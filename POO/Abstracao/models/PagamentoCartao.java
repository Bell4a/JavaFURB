package models;

public class PagamentoCartao extends Pagamento {
    
    @Override
    public double calcularValorFinal(){
        double acrescimo = super. valor + (super.valor * 3 / 100);
        return acrescimo;
    }

}
