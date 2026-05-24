import java.util.Scanner;

public class Uni6Ex11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int vetor1[] = new int[10];   
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        //Ler os valores e armazenar no vetor
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetor1[cont] = teclado.nextInt();
        }

        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite o valor da posição " + cont);
            vetor2[cont] = teclado.nextInt();
        }

        for (int cont = 0; cont < 10; cont++) {
            if (vetor1[cont] == vetor2[cont]) {
                vetor3[cont] = 1;
            } else {
                vetor3[cont] = 0;
            }

            System.out.println(vetor3[cont]);
        }
    }
}
