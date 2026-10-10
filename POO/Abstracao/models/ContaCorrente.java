package models;

public class ContaCorrente extends ContasBancaria {
    
    @Override 
    public double sacar(double valor) {
        double saque = saldo - valor - 2;
        return saque;
    };
}
