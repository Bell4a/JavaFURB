//SWITCH, BREAK E DEFAULT

import java.util.Scanner;

public class Uni4Ex22 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 1 para Ciência da Computação; 2 para Licenciatura da Computação; 3 para Sistemas de Informação; 4 para Ciência de Dados: ");
        int opcao = teclado.nextInt();

        teclado.close();

        switch (opcao) {
            case 1: System.out.println("Bacharel em Ciência da Computação");
            break;
            case 2: System.out.println("Licenciado em Computação");
            break;
            case 3: System.out.println("Bacharel em Sistemas da Informação");
            break;
            case 4: System.out.println("Bacharel em Ciência de Dados");
            break;
            default: System.out.println("Opção Inválida");
        }
    }
}