package models;

public class CursoPresencial extends Curso {
    
    @Override 
    public double calcularMensalidade() {
        double mensalidade = super.cargaHoraria * 10;
        return mensalidade;
    }

}
