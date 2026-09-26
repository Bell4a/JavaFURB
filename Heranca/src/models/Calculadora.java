package src.models;

public class Calculadora {
    
    protected double valor1;
    protected double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double somar() {
        double soma = valor1 + valor2;
        return soma;
    }

    public double somar(int valor1, int valor2) {
        int soma = valor1 + valor2;
        return soma;
    }

    public double somar(int valor1, int valor2, int valor3) {
        int soma = valor1 + valor2 + valor3;
        return soma;
    }

    public double subtrair() {
        double subtracao = valor1 - valor2;
        return subtracao;
    }

    public double dividir() {
        double divisao = valor1 / valor2;
        return divisao;
    }

    public double multiplicar() {
        double multi = valor1 * valor2;
        return multi;
    }
}
