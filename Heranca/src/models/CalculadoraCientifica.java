package src.models;

public class CalculadoraCientifica extends Calculadora {

    public double potencializar() {
        double potencia = Math.pow(valor1, valor1);
        return potencia;
    }

    public double tirarRaiz() {
        double raiz = Math.sqrt(valor1);
        return raiz;
    }
}
