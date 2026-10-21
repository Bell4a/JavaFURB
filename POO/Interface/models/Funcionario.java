public class Funcionario implements Identificavel {
    private String codigo;
    private String nome;

    public Funcionario(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String obterIdentificacao() {
        // Retorna a identificação contendo o código e o nome[cite: 8]
        return "Código: " + this.codigo + ", Nome: " + this.nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}