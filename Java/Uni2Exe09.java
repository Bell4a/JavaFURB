/* Entrada = valorDolar
Saída = valorReal */

import java.util.Scanner;

public class Uni2Exe09 {

    public static void main(String[] args) {
        double valorDolar, valorReal;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Quantos dólares você quer trocar? ");
        valorDolar = teclado.nextDouble();

        valorReal = valorDolar * 5.26;

        System.out.println("O valor a ser devolvido é de: " + valorReal + " reais");

        teclado.close();
    }
    
}
