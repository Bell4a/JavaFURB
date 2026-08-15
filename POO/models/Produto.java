public class Produto {
    
    String nome;
    Pessoa comprador;
    double preco;
    int quantEstoque;
    boolean disponivel;
    Fabricante fabricante;

    public double retornarPreco() {
        return preco;
    }
}
