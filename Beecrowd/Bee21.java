/*
Leia 4 valores inteiros A, B, C e D. 
Se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/

import java.io.IOException;
import java.util.Scanner;

public class Bee21 {
    
    public static void main(String[] args) throws IOException {
    
    Scanner teclado = new Scanner(System.in);   

    int a, b, c, d;

    System.out.println("Valor A: ");
    a = teclado.nextInt();
    System.out.println("Valor B: ");
    b = teclado.nextInt();
    System.out.println("Valor C: ");
    c = teclado.nextInt();
    System.out.println("Valor D: ");
    d = teclado.nextInt();

    teclado.close();

    if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2 == 0)) {
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores não aceitos");
    }
    }
}
