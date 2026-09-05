package Array.classes;

import java.util.ArrayList;

public class Departamento {
    
   private int codigo;
   private String nome;
   private ArrayList<Funcionario> funcionarios;
   
   public int getCodigo() {
    return codigo;
   }
   public void setCodigo(int codigo) {
    this.codigo = codigo;
   }
   public String getNome() {
    return nome;
   }
   public void setNome(String nome) {
    this.nome = nome;
   }
   public ArrayList<Funcionario> getFuncionarios() {
    return funcionarios;
   }
   public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
   }

   
   
}
