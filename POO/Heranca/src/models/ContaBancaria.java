package src.models;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public double depositar(double valor) {
        saldo = saldo + valor;
        return saldo;
    }

    public double sacar(double valor) {
        return valor;
    }
}
