// Jogo de Cartas (Trincas e Sequências)

import java.util.Scanner;

public class Estudo3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numCartas = 9;
        
        int[] numeros = new int[numCartas];
        int[] naipes = new int[numCartas];
        
        System.out.println("--- Entrada das 9 Cartas ---");
        for (int i = 0; i < numCartas; i++) {
            System.out.print("Carta " + (i + 1) + " - Número (1 a 13): ");
            numeros[i] = teclado.nextInt();
            System.out.print("Carta " + (i + 1) + " - Naipe (1 a 4): ");
            naipes[i] = teclado.nextInt();
            System.out.println("-------------------------");
        }
        
        // Ordena as cartas para facilitar a busca de sequências e trincas consecutivas
        ordenarCartas(numeros, naipes);
        
        // a) Identificar trincas (pelo menos 3 cartas de naipes diferentes com o mesmo valor)
        int trincas = contarTrincas(numeros, naipes);
        
        // b) Identificar sequências (3 cartas do mesmo naipe cujos valores sejam consecutivos)
        int sequencias = contarSequencias(numeros, naipes);
        
        // Cálculo de pontuação
        int pontuacaoTotal = (trincas * 50) + (sequencias * 100);
        
        System.out.println("\n--- RESULTADO DO JOGO ---");
        System.out.println("Quantidade de trincas encontradas: " + trincas);
        System.out.println("Quantidade de sequências encontradas: " + sequencias);
        System.out.println("Pontuação Total do jogador: " + pontuacaoTotal + " pontos.");
        
        teclado.close();
    }

    // Método bolha simples para ordenar por número e usar o naipe como critério de desempate
    public static void ordenarCartas(int[] numeros, int[] naipes) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1] || (numeros[j] == numeros[j + 1] && naipes[j] > naipes[j + 1])) {
                    int tempNum = numeros[j]; numeros[j] = numeros[j + 1]; numeros[j + 1] = tempNum;
                    int tempNai = naipes[j]; naipes[j] = naipes[j + 1]; naipes[j + 1] = tempNai;
                }
            }
        }
    }

    public static int contarTrincas(int[] numeros, int[] naipes) {
        int trincas = 0;
        // Como o vetor está ordenado por número, valores iguais ficam juntos
        for (int i = 0; i < numeros.length - 2; i++) {
            if (numeros[i] == numeros[i + 1] && numeros[i] == numeros[i + 2]) {
                // Verifica se os três naipes são diferentes entre si
                if (naipes[i] != naipes[i + 1] && naipes[i] != naipes[i + 2] && naipes[i + 1] != naipes[i + 2]) {
                    trincas++;
                    i += 2; // Avança para não contar a mesma trinca de forma sobreposta
                }
            }
        }
        return trincas;
    }

    public static int contarSequencias(int[] numeros, int[] naipes) {
        int sequencias = 0;
        
        // Para achar sequências do mesmo naipe, vamos buscar de forma exaustiva combinações de 3 cartas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                for (int k = 0; k < numeros.length; k++) {
                    // Verifica se pertencem ao mesmo naipe
                    if (naipes[i] == naipes[j] && naipes[j] == naipes[k]) {
                        // Verifica se formam uma sequência exata (ex: X, X+1, X+2)
                        if (numeros[j] == numeros[i] + 1 && numeros[k] == numeros[j] + 1) {
                            sequencias++;
                        }
                    }
                }
            }
        }
        return sequencias;
    }
}