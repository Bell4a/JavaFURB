/*se valor1 > valor2 então
escrever
*/

import java.util.Scanner;

public class Uni4Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor1, valor2;

        System.out.println("Digite o primeiro valor");
        valor1 = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = teclado.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + "é maior que" + valor2);
        } else {
            if(valor2 > valor1) {
                System.out.println(valor2 + "é maior que" + valor1);
            } else {
                System.out.println("Os valores são iguais.");
            }
        }

        teclado.close();

    }
    
}
