package models;

public class PlanoBasico extends PlanoAcademia {

    @Override
    public double calcularMensalidade() {
        return super.valorBase;
    }
}
