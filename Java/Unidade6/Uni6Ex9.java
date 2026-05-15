//Cinema

import java.util.Scanner;

public class Uni6Ex9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas pessoas? ");
        int n = teclado.nextInt();

        int contM = 0, MmaisJovem = Integer.MAX_VALUE, contaAcima = 0;
        float somaNota= 0, somaNotaM = 0, notaMulherJovem = 0;
        float nota[] = new float[n];
        int idade[] = new int[n];
        byte sexo[] = new byte[n];
        

        for (int cont = 0; cont < n; cont++) {
            System.out.println("Sexo: ");
            sexo[cont] = teclado.nextByte();
            System.out.println("Nota: ");
            nota[cont] = teclado.nextFloat();
            System.out.println("Idade: ");
            idade[cont] = teclado.nextInt();

            somaNota += nota[cont];

            //1 = sexo fem; 2 = sexo masc
            if (sexo[cont] == 2) {
                somaNotaM += nota[cont];
                contM ++;
            } else {
                if (sexo[cont] == 1 && idade[cont] < MmaisJovem) {
                    MmaisJovem = idade[cont];
                    notaMulherJovem = nota[cont];
                }
            }
        }

        float media = somaNota / n;

        for (int cont = 0; cont < n; cont++) {
            if (sexo[cont] == 1 && nota[cont] > media) {
                contaAcima++;
            }
        }

        System.out.println("Média das notas: " + media);
        System.out.println("Média das notas dada pelos homens: " + somaNotaM / contM);
        System.out.println("Nota da mulher mais nova: " + notaMulherJovem);
        System.out.println("Mulheres 50+ que deram nota maior que a média geral: " + contaAcima);
    }
}
