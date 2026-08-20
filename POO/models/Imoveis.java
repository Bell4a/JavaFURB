public class Imoveis {
    private String tipo;
    private double valor;
    private double area;
    private Pessoa proprietario;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}
