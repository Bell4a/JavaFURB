//vogal

import java.util.Scanner;

public class Uni4Ex8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite uma letra");
        //Lê caractere
        char caractere = teclado.next().charAt(0);
        //Upper do Java
        caractere = Character.toUpperCase(caractere);

        if (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("É uma vogal");
        } else {
            System.out.println("Não é uma vogal");
        }

        teclado.close();
    } 
}