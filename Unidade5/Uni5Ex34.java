

import java.util.Scanner;

public class Uni5Ex34 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    soma1 = 0;
    double taxa;
    int opcao;

        do {

            System.out.println("'1' para encerrar a conta de um hóspede \n '2' verificar número de contas encerradas \n '3' sair");
            System.out.println("Digite 1, 2 ou 3");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("Nome do hóspede: ");
                    String nome = teclado.next();
                    System.out.println("Quantidade de diárias: ");
                    int diaria = teclado.nextInt();

                    if (diaria < 15) {
                       taxa = diaria * 7.50 + 50;
                    } else {
                        if (diaria == 15) {
                            taxa = diaria * 6.50 + 50;
                        } else {
                            taxa = diaria * 5 + 50;
                        }
                    }

                    System.out.println(nome + taxa);
                } break;

                case 2: {
                    System.out.println(soma1);
                } break;

            }
        } while (opcao != 3);
    }
}
