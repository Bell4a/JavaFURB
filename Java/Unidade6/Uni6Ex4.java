/*
ler os valores de 2 vetores (10)
vetor 3 = soma dos 2 vetores
*/

import java.util.Scanner;

public class Uni6Ex4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int soma[] = new int[10];

        //ler valores do vetor 1
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite o valor " + cont + " do vetor 1");
            vetor1[cont] = teclado.nextInt();
        }

        //ler valores do vetor 2
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite o valor " + cont + "do vetor 2");
            vetor2[cont] = teclado.nextInt();
        }

        for (int cont = 0; cont < 10; cont++) {
            soma[cont] = vetor1[cont] + vetor2[cont];
            System.out.println(soma[cont]);
        }

    
    }
    
}
