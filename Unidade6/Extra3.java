import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int totalCartas = 9;
        int[] numeros = new int[totalCartas];
        int[] naipes = new int[totalCartas];
        
        // 1. Entrada de dados (9 cartas)
        for (int i = 0; i < totalCartas; i++) {
            System.out.println("--- Carta " + (i + 1) + " ---");
            System.out.print("Número (1 a 13): ");
            numeros[i] = teclado.nextInt();
            System.out.print("Naipe (1 a 4): ");
            naipes[i] = teclado.nextInt();
        }
        
        // a) Identificar TRINCAS (3 cartas com o mesmo valor)
        int totalTrincas = 0;
        boolean[] verificadoTrinca = new boolean[totalCartas];
        
        for (int i = 0; i < totalCartas; i++) {
            if (verificadoTrinca[i]) {
                continue;
            }
            
            int contagemIguais = 1;
            for (int j = i + 1; j < totalCartas; j++) {
                if (numeros[i] == numeros[j]) {
                    contagemIguais++;
                    verificadoTrinca[j] = true; // Marca para não contar de novo
                }
            }
            
            // Se encontrou pelo menos 3 cartas iguais, formou uma trinca
            if (contagemIguais >= 3) {
                totalTrincas++;
            }
        }
        System.out.println("\na) Quantidade de trincas encontradas: " + totalTrincas);
        
        // b) Identificar SEQUÊNCIAS (3 consecutivas do mesmo naipe)
        // Primeiro, vamos ordenar as cartas por número para facilitar a busca consecutiva
        for (int i = 0; i < totalCartas - 1; i++) {
            for (int j = 0; j < totalCartas - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca número
                    int tempNum = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tempNum;
                    
                    // Troca naipe correspondente
                    int tempNaipe = naipes[j];
                    naipes[j] = naipes[j + 1];
                    naipes[j + 1] = tempNaipe;
                }
            }
        }
        
        int totalSequencias = 0;
        
        // Varre procurando trios onde o naipe seja igual e os números sejam em sequência
        // O loop vai até 'totalCartas - 2' para podermos olhar com segurança os próximos dois vizinhos (j e k)
        for (int i = 0; i < totalCartas - 2; i++) {
            for (int j = i + 1; j < totalCartas - 1; j++) {
                // A segunda carta deve ser o número da primeira + 1 e ter o mesmo naipe
                if (numeros[j] == numeros[i] + 1 && naipes[j] == naipes[i]) {
                    
                    for (int k = j + 1; k < totalCartas; k++) {
                        // A terceira carta deve ser o número da segunda + 1 e ter o mesmo naipe
                        if (numeros[k] == numeros[j] + 1 && naipes[k] == naipes[j]) {
                            totalSequencias++;
                        }
                    }
                }
            }
        }
        System.out.println("b) Quantidade de sequências encontradas: " + totalSequencias);
        
        // Cálculo da Pontuação Total

        int pontuacaoTotal = (totalTrincas * 50) + (totalSequencias * 100);
        System.out.println("\nPONTUAÇÃO TOTAL DO JOGADOR: " + pontuacaoTotal + " pontos.");
        
        teclado.close();
    }
}