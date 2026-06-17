//Compatibilidade de dois vetores
import java.util.Scanner;

public class Uni7Ex8 {

    public int[] lerVetorInteiros(int n) {
        // Função que cria um vetor de 5 posições inteiras
        Scanner teclado = new Scanner(System.in);
        // criar vetor
        int vetorInt[] = new int[n];
        //Ler vetor
        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetorInt[cont] = teclado.nextInt();
        }
        return vetorInt;
    }

    private int calcularAfinidade(int vetorA[], int vetorB[]) {
        //Função que calcula a afinidade entre os vetores

        int afinidade = 0, diferenca;
        //Percorrer os vetores

        for(int cont = 0; cont < 5; cont++) {
            diferenca = Math.abs(vetorA[cont] - vetorB[cont]);
            
            if (diferenca == 0) {
                afinidade += 3;
            } else if (diferenca >= 3) {
                afinidade -= 2;
            } else {
                afinidade++;
            }
        }
        return afinidade;
    }

    public static void main(String[] args) {
        Uni7Ex8 exercicio = new Uni7Ex8(); 

        //Ler os valores da pessoa A
        System.out.println("Digite as notas da primeira pessoa");
        int vetorA[] = exercicio.lerVetorInteiros(5);
        //Ler os valores da pessoa B
        System.out.println("Digite as notas da primeira pessoa");
        int vetorB[] = exercicio.lerVetorInteiros(5);

        //Calcular afinidade
        System.out.println("Afinidade = " + exercicio.calcularAfinidade(vetorA, vetorB));
        
    }
}

