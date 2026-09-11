public class Calculadora {

    private double valor1;
    private double valor2;
    private String operacao;

    // Construtor vazio (opcional)
    public Calculadora() {
    }

    // Construtor completo (opcional)
    public Calculadora(double valor1, double valor2, String operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;
    }

    // Getter e Setter para 'valor1'
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    // Getter e Setter para 'valor2'
    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    // Getter e Setter para 'operacao'
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}