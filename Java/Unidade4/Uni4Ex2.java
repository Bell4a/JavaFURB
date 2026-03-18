import java.util.Scanner;

public class Uni4Ex2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite um número inteiro");
        int valor = teclado.nextInt();

        //par ou ímpar
        if (valor % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        
        teclado.close();
    }
}
