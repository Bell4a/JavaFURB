package src.models;

public class FreteExpresso extends Frete {
    
    public double calcularValor2(double peso, double distancia) {
        var valor = super.calcularValor2();
        valor = valor + 15;
        return valor;
    }
}
