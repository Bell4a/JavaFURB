public class Livro {
    private String titulo;
    private Pessoa autor;
    private int numeroPaginas;
    private int anoPublicacao;

    public String retornarTitulo() {
        return titulo;
    }

    public int retornarPg() {
        return numeroPaginas;
    }

    public String descrever() {
        return (titulo + "-" + numeroPaginas + "-" + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}
