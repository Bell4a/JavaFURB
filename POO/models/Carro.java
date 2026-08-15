public class Carro {
    String modelo;
    String cor;
    Pessoa dono;
    Motor motor;
    int ano;
    boolean ligado;
    int quantKm;

    public boolean ligarCarro() {
        if (ligado == false) {
            ligado = true;
            return ligado;
        }
        return ligado;
    }

    public boolean desligarCarro() {
        if (ligado == true) {
            ligado = false;
            return ligado;
        }
        return ligado;
    }
}

