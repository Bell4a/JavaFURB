// maior e menor num

import java.util.Scanner;

public class Uni5Ex7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a quantidade de valores: ");
            int n = teclado.nextInt();
            float maior = Float.MIN_VALUE;
            float menor = Float.MAX_VALUE;

            for (int cont = 1; cont <= n; cont++) {
            //ler o num
            System.out.println("Digite um valor inteiro: ");
            float valor = teclado.nextFloat();

            if (valor > maior) {
                maior = valor;
            } 

            if (valor < menor) {
                menor = valor;
            }
        } teclado.close();
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
