package models;

public class PlanoFamilia extends PlanoAcademia {
    
    @Override
    public double calcularMensalidade(int qtdDependente) {
        double mensalidadeF = super.valorBase + (30 * qtdDependente);
        return mensalidadeF;
    }
}
