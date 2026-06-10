// Conversão binário para decimal e decimal para binário sem vetor

import java.util.Scanner;

public class Uni7Ex9 {

    private int decToBin {

        original = decimal;
        binario = decimal / 100;
        decimal = decimal % 100;
       
    }

    private int binToDec {

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Uni7Ex9 exercicio = Uni7Ex9();

        int decimal, opcao;
        String binario;

        do {
            System.out.println("Escolha a conversão: ");
            System.out.println("1 - Decimal para Binário");
            System.out.println("2 - Binário para Decimal");

            opcao = teclado.nextInt();

            //Escolher a opção
            switch (opcao){
                case 1:
                    System.out.println("Informe um número decimal");
                    decimal = teclado.nextInt();
                    binario = exercicio.decToBin (decimal);

                    System.out.println("Numero em binário: " + binario);
                    break;
                
                case 2:
                    System.out.println("Informe um número binário");
                    binario = teclado.nextLine();
                    decimal = exercicio.binToDec (binario);
                    System.out.println("Numero em decimal: " + decimal);
                    break;               
            }
            
        } while (opcao >= 1 && opcao <= 2);
    }
}
