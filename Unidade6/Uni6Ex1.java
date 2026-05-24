// VETORES

import java.util.Scanner;

public class Uni6Ex1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Definir vetor com 10 elementos

        int x[] = new int[10];

        //ler os números

        for (int cont = 0; cont <= 9; cont++) {
            System.out.println("Digite o valor: " + cont);
            x[cont] = teclado.nextInt();
        }

        System.out.println("Vetor Invertido");

        //escrever os números na ordem inversa
        for (int cont = 9; cont >= 0; cont--) {
            System.out.println(x[cont]);
        }

        teclado.close();
    }
}
