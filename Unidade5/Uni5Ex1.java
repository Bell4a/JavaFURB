import java.util.Scanner;

public class Uni5Ex1 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    for (int cont = 1; cont <= 20; cont++) {
        //ler o num
        System.out.println("Digite um número inteiro maior do que 0");
        int numero = teclado.nextInt();

        //testar se o número é divisível por 2
        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }
    teclado.close();

    }
}