package models;

public class PlanoPremium extends PlanoAcademia {
    
    @Override
    public double calcularMensalidade() {
        return super.valorBase + 50;
    }

}
