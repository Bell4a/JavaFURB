package Array.classes;

import java.util.ArrayList;

public class Pedido {

   private int numero;
   private int data;
   private double valorTotal;
   private ArrayList<Produto> produtos;
   
   public int getNumero() {
      return numero;
   }
   public void setNumero(int numero) {
      this.numero = numero;
   }
   public int getData() {
      return data;
   }
   public void setData(int data) {
      this.data = data;
   }
   public double getValorTotal() {
      return valorTotal;
   }
   public void setValorTotal(double valorTotal) {
      this.valorTotal = valorTotal;
   }
   public ArrayList<Produto> getProdutos() {
      return produtos;
   }
   public void setProdutos(ArrayList<Produto> produtos) {
      this.produtos = produtos;
   }

   

}
