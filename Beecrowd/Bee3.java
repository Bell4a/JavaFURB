//multiplicação

import java.util.Scanner;

public class Bee3 {

    public static void main(String[] args) {
        //variaveis
        int A, B, PROD;

        //classe pra leitura dos dados
        Scanner teclado = new Scanner (System.in);

        //comando de leitura
        System.err.println("Digite um número inteiro:");
        A = teclado.nextInt();
        System.err.println("Digite outro número inteiro para multiplicar:");
        B = teclado.nextInt();

        //somar os valores
        PROD = A * B;

        //resultado
        System.out.println ("PROD = " + PROD);

        teclado.close();

    }
    
}
