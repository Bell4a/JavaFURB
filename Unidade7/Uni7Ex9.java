// Conversão binário para decimal e decimal para binário sem vetor

import java.util.Scanner;

public class Uni7Ex9 {

    public String decToBin (int decimal){
        // Funcção que recebe decimal e retorna binário

        int numero = decimal;
        String binario = ""; //Cria variável pro binário
        //Enquanto não chegar no fim do decimal
        while (numero > 0) {
            //Concatenar o resto da divisão do número com o que eu tinha no binário
            binario = numero % 2 + binario;
            //Dividir o número para saber o próximo binário
            numero = numero / 2;
        }

       return binario;
    }

    private int binToDec (String binario){
        // Funcção que recebe binário e retorna decimal

        //Inicializar variáveis
        int soma = 0;
        int posicao = 0;

        for (int cont = binario.length() - 1; cont >= 0; cont--){

            if (binario.charAt(posicao) != '0') {
                //Não somar se for 0, somente 1;
                soma += Math.pow(2, cont);
            }
            posicao++;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Uni7Ex9 exercicio = new Uni7Ex9();

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
                    binario = teclado.next();
                    decimal = exercicio.binToDec (binario);
                    System.out.println("Numero em decimal: " + decimal);
                    break;               
            }
            
        } while (opcao >= 1 && opcao <= 2);
    }
}
