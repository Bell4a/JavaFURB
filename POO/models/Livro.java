public class Livro {
    String titulo;
    Pessoa autor;
    int numeroPaginas;
    int anoPublicacao;

    public String retornarTitulo() {
        return titulo;
    }

    public int retornarPg() {
        return numeroPaginas;
    }

    public String descrever() {
        return (titulo + "-" + numeroPaginas + "-" + anoPublicacao);
    }
}
