/*
LER numero

notas100 = numero/100
numero = numero % 100 (resto)
notas50 = numero/50
numero = numero % 50
notas20 = numero/20
numero = numero % 20
notas10 = numero/10
numero = numero % 10
notas5 = numero/5
numero = numero % 5
notas2 = numero/2
notas 1 = numero % 2


ESCRVER (notas100, notas50...)

*/

import java.util.Scanner;

public class Uni2Ex14 {
    
    public static void main(String[] args) {
        int numeroOriginal, numero, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de dinheiro:");
        numero = teclado.nextInt();

        numeroOriginal = numero;
        notas100 = numero / 100;
        numero = numero % 100;
        notas50 = numero / 50;
        numero = numero % 50;
        notas20 = numero / 20;
        numero = numero % 20;
        notas10 = numero / 10;
        numero = numero % 10;
        notas5 = numero / 5;
        numero = numero % 5;
        notas2 = numero / 2;
        notas1 = numero % 2;

        System.out.println(numero);
        System.out.println("Quantidade de notas de 100: " + notas100);
        System.out.println("Quantidade de notas de 50: " + notas50);
        System.out.println("Quantidade de notas de 20: " + notas20);
        System.out.println("Quantidade de notas de 10: " + notas10);
        System.out.println("Quantidade de notas de 5: " + notas5);
        System.out.println("Quantidade de notas de 2: " + notas2);
        System.out.println("Quatidade de notas 1: " + notas1);
        
        teclado.close();

    }
}
