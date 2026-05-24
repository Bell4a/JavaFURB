//Ordem

import java.util.Scanner;

public class Uni4Ex24 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = teclado.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = teclado.nextInt();

        System.out.println("Digite 1 para ordem crescente; 2 para ordem decrescente; 3 para que o valor maior fique no meio");
        int opcao = teclado.nextInt();

        teclado.close();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else {
            if (numero2 > numero1 && numero2 > numero3) {
                maior = numero2;
            } else {
                maior = numero3;
            }
        }

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else {
            if (numero2 < numero1 && numero2 < numero3) {
                menor = numero2;
            } else {
                menor = numero3;
            }
        }

        meio = (numero1 + numero2 + numero3) - (maior + menor);



        switch (opcao) {
            case 1: System.out.printf("%d, %d, %d", menor, meio, maior);
            break;
            case 2: System.out.printf("%d, %d, %d", maior, meio, menor);
            break;
            case 3: System.out.printf("%d, %d, %d", menor, maior, meio);
            break;
            default: System.out.println("Erro");
        }
    }
}