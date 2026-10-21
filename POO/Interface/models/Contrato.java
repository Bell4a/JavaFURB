public class Contrato implements Imprimivel {
    private int numero;

    public Contrato(int numero) {
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Contrato número: " + this.numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}