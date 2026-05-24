//MÚLTIPLOS

import java.util.Scanner;

public class Uni4Ex9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int numero1, numero2;
        System.out.println("Digite um número inteiro");
        numero1 = teclado.nextInt();
        System.out.println("Digite outro número inteiro");
        numero2 = teclado.nextInt();

        teclado.close();

        if (numero1 % numero2 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    } 
}