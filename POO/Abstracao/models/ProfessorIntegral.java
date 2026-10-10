package models;

public class ProfessorIntegral extends Professor {
    
    @Override 
    public double calcularSalario(int qntHoras) {
        double salario = super.valorHora * 160;
        return salario;
    }

}
