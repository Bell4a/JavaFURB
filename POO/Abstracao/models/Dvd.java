package models;

public class Dvd extends ItemBiblioteca {
    
    @Override 
    public int calcularPrazoEmprestimo(){
        return 3;
    }
}
