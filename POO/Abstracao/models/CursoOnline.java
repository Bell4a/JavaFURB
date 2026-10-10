package models;

public class CursoOnline extends Curso {
    
    @Override 
    public double calcularMensalidade() {
        double mensalidade = super.cargaHoraria * 20;
        return mensalidade;
    }
}
