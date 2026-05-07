// Pesquisa com vetor

import java.util.Scanner;

public class Uni6Ex6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Definir o tamanho do vetor
        System.out.println("Informe o tamanho do vetor: ");
        int n = teclado.nextInt();

        //Criar o vetor com tamanho n
        float vetor[] = new float[n];

        //Ler os valores e armazenar no vetor
        for (int cont = 0; cont < n; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetor[cont] = teclado.nextFloat();

        }

        //Variável p indicar se o valor não foi encontrado
        boolean achou = false;

        //Ler o valor a ser encontrado
        System.out.println("Digite o valor a ser pesquisado: ");
        float valor = teclado.nextFloat();

        //Percorrer o vetor para procurar o valor
        for (int cont = 0; cont < n; cont++) {
            //Verificar se o valor da posição cont é procurado
            if (vetor[cont] == valor) {
                achou = true;
                break; //Interrompe a pesquisa

            }
        }

        //Informar se o valor existe
        System.out.println(achou ? "O valor está no vetor" : "O valor não está no vetor");
        
        /* if (achou) {
            System.out.println("O valor está no vetor");
        } else {
            System.out.println("O valor não está no vetor");
        } */
        

    }
}
