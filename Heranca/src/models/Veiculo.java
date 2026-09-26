package src.models;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valorDiariaV;


    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDados() {
        return ("Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano);
    }

    public double calcularValorLocacao(int dias) {
        double locacao = valorDiariaV * dias;
        return locacao;
    }
}
