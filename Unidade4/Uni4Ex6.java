import java.util.Scanner;

public class Uni4Ex6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite 'F', 'M' ou 'I'");
        //Lê caractere
        char caractere = teclado.next().charAt(0);
        //Upper do Java
        caractere = Character.toUpperCase(caractere);

        if (caractere == 'M') {
            System.out.println("Masculino");
        } else {
            if (caractere == 'F') {
                System.out.println("Feminino");     
            } else {
                if (caractere == 'I') {
                    System.out.println("Não Informado");
                } else {
                    System.out.println("Entrada Incorreta");
                }
            }
        }
        teclado.close();
    } 
}