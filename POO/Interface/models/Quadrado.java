public class Quadrado implements Calculavel {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        // O método calcular retorna a área do quadrado (lado * lado)
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}