package models;

public abstract class ContasBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
        double deposito = saldo + valor;
        return deposito;
    }
    
    public double sacar(double valor) {
        double saque = saldo - valor;
        return saque;
    };
}
