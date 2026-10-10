package models;

public class Revista extends ItemBiblioteca {
    
    @Override 
    public int calcularPrazoEmprestimo(){
        return 7;
    }

}
