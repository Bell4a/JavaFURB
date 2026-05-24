// Histogrma Números Repitidos

import java.util.Scanner;

public class Uni6Ex12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        int n = teclado.nextInt();

        //vetor N

        do { 
            System.out.println("Digite a quantidade de valores (máz 20)");
            n = teclado.nextInt();
        } while (n > 20);

        int vetorN[] = new int[n];
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o valor da posição: " + cont + "(Entre 50 e 70)");
            do { 
                vetorN[cont] = teclado.nextInt();
            } while (vetorN[cont] < 50 || vetorN[cont] > 70);
        }

        //Vetor quantidade e inicializar todas as posições com 0
        int quant[] = new int[21];
        for (int cont = 0; cont < 21; cont++) {
            quant[cont] = 0;
        }
        
        //Contar a quantidade de números
        for (int cont = 0; cont < n; cont++) {
            //Verificar a posição do número
            int posicao = vetorN[cont] - 50;
            //Incrementar a quantidade
            quant[posicao]++;
        }

        //Escrever o histograma
        for (int numero = 50; numero <= 70; numero++) {
            System.out.printf("%d", numero);
            for (int cont = 0; cont < quant [numero - 50]; cont++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
