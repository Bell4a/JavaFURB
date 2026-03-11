//Soma

import java.util.Scanner;

public class Bee1 {

    public static void main(String[] args) {
        //variaveis
        int A, B, X;

        //classe pra leitura dos dados
        Scanner teclado = new Scanner (System.in);

        //comando de leitura
        System.err.println("Digite um número inteiro:");
        A = teclado.nextInt();
        System.err.println("Digite outro número inteiro para somar:");
        B = teclado.nextInt();

        //somar os valores
        X = A + B;

        //resultado
        System.out.println ("X = " + X);

        teclado.close();

    }
    
}