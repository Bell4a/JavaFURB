package models;

public class Retangulo extends Forma{
    double altura;
    double largura;

    @Override 
    public double calcularArea() {
        double area = altura * largura;
        return area;
    }
}
