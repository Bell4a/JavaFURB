public class Passagens {
    private String codigo;
    private double valor;
    private boolean passagemConfirmada;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isPassagemConfirmada() {
        return passagemConfirmada;
    }
    public void setPassagemConfirmada(boolean passagemConfirmada) {
        this.passagemConfirmada = passagemConfirmada;
    }
}
