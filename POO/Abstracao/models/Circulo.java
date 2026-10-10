package models;

public class Circulo extends Forma{
    protected double raio;

    @Override
    public double calcularArea() {
        double area = Math.PI * (raio * raio);
        return area;
    }
}
