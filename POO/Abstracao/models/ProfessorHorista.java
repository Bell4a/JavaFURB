package models;

public class ProfessorHorista extends Professor {

    @Override 
    public double calcularSalario(int qntHoras) {
        double salario = super.valorHora * qntHoras;
        return salario;
    }

}
