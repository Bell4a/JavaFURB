package src.models;

public class Frete {
    
    protected double peso;
    protected double distancia;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double calcularValor2() {
        double valor = (peso * 0.50) + (distancia * 0.10);
        return valor;
    }
    
}
