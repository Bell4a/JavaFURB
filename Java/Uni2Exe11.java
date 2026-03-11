/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

*/

import java.util.Scanner;

public class Uni2Exe11 {
    
    public static void main(String[] args) {

        float valorA, valorB, valorC, trianguloRetangulo, circulo, trapezio, quadrado, retanguloAB;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o valor A");
        valorA = teclado.nextFloat();
        System.out.println("Digite o valor B");
        valorB = teclado.nextFloat();
        System.out.println("Digite o valor C");
        valorC = teclado.nextFloat();

        trianguloRetangulo = valorA * valorC; 
        circulo = (float) Math.PI * (float) Math.pow (valorC, 2);
        trapezio = ((valorA + valorB) * valorC) / 2;
        quadrado = valorB * valorB;
        retanguloAB = valorA * valorB;


        System.out.println("Área do triângulo retângulo que tem A por base e C por altura: " + trianguloRetangulo);
        System.out.println("Área do círculo de raio C: " + circulo);
        System.out.println("Área do trapézio que tem A e B por bases e C por altura: " + trapezio);
        System.out.println("Área do quadrado que tem lado B: " + quadrado);
        System.out.println("área do retângulo que tem lados A e B: " + retanguloAB);


        teclado.close();
    }
}
