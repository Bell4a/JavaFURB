package src.models;

public class Apartamento extends Imovel {
    protected int andar;
    protected double valorCondominio;

    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double calcularCustoMensal() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

}
