package models;

public class ContaPoupanca extends ContasBancaria {
    
    @Override 
    public double sacar(double valor) {
        double saque = saldo - valor;
        return saque;
    };

}
