package src.models;

public class Casa extends Imovel {
    protected boolean possuiGaragem;
    protected int quantQuartos;

    public Casa() {
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }
    public void setPossuiGaragem(boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }
    public int getQuantQuartos() {
        return quantQuartos;
    }
    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }
}
