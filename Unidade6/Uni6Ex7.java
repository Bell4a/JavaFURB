import java.util.Scanner;

public class Uni6Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int N = 0;
        while (N <= 0 || N > 20) {
            System.out.print("Informe o tamanho do vetor (1 a 20): ");
            N = teclado.nextInt();
        }
        
        int[] vetor = new int[N];
        
        int i = 0;
        while (i < N) {
            System.out.print("Digite o valor para a posição [" + i + "]: ");
            int valorDigitado = teclado.nextInt();
            
            boolean jaExiste = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == valorDigitado) {
                    jaExiste = true;
                    break; // Se achou um igual, não precisa continuar olhando o resto
                }
            }
            
            if (jaExiste) {
                System.out.println("Este número já foi inserido. Tente outro!");
            } else {
                vetor[i] = valorDigitado;
                i++;
            }
        }
        
        System.out.print("\nVetor origem: ");
        for (int k = 0; k < N; k++) {
            System.out.print("[" + vetor[k] + "]");
        }
        System.out.println();
        
        //Bubblesort
        for (int k = 0; k < N - 1; k++) {
            for (int j = 0; j < N - 1 - k; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos de lugar se o atual for maior que o próximo
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Vetor ordenado: ");
        for (int k = 0; k < N; k++) {
            System.out.print("[" + vetor[k] + "]");
        }
        System.out.println();
        
        teclado.close();
    }
}