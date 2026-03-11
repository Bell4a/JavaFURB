//Valor qnt peças

/* Entrada = quant peça, valor peça. 
Saída = valor a ser pago (valorFinal).
*/

import java.util.Scanner;

public class Uni2Exe08 {  
    public static void main(String[] args) {
        int peca1, peca2, valor1, valor2, valorTotal;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe a quantidade de peças tipo 1:");
        peca1 = teclado.nextInt();
        System.out.println("Informe o valor da peça 1:");
        valor1 = teclado.nextInt();
        System.out.println("Informe a quantidade de peças tipo 2:");
        peca2 = teclado.nextInt();
        System.out.println("Informe o valor da peça 2:");
        valor2 = teclado.nextInt();

        valorTotal = peca1 * valor1 + peca2 * valor2;

        System.out.println("O valor a pagar é de " + valorTotal + " reais.");

        teclado.close();
    }
}
