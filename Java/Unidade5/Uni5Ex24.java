//Pesca de peixes com limite de peso

import java.util.Scanner;

public class Uni5Ex24 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        char opcao;

        System.out.println("Informe o limite diário (em Kg): ");
        double limite = teclado.nextDouble();
        
        do {
            System.out.println("Informe o peso do peixe (em g): ");
            double peso = teclado.nextDouble();

            soma += peso;
            System.out.println("Pescado até o momento: " + soma);

            if (soma > (limite * 1000)) {
                System.out.println("Excedeu o Limite!");
                break; //para repetição
            }

            System.out.println("Deseja informar o peso de mais um peixe? (s ou n): ");
            opcao = teclado.next().charAt(0);
        } while (opcao == 's' || opcao == 'S');

        teclado.close();
    } 
} 
