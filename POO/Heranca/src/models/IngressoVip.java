package src.models;

public class IngressoVip extends Ingresso {
    protected double valorAdd;

    public double getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    public double calcularValorTotal() {
        double valorTotal = valor + valorAdd;
        return valorTotal;
    }
}
