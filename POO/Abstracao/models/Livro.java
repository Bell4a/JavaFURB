package models;

public class Livro extends ItemBiblioteca {
    
    @Override 
    public int calcularPrazoEmprestimo(){
        return 15;
    }

}
