public class Carro {
    private String modelo;
    private String cor;
    private Pessoa dono;
    private Motor motor;
    private int ano;
    private boolean ligado;
    private int quantKm;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getQuantKm() {
        return quantKm;
    }

    public void setQuantKm(int quantKm) {
        this.quantKm = quantKm;
    }
}

