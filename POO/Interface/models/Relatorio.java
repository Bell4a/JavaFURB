public class Relatorio implements Imprimivel {
    private String titulo;

    public Relatorio(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {
        System.out.println("Relatório: " + this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}