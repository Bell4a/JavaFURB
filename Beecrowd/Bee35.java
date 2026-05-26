import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variaveis
        int A, B, C, D, DIFERENCA;

        //classe pra leitura dos dados
        Scanner teclado = new Scanner (System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //somar os valores
        DIFERENCA = (A * B - C * D);

        //resultado
        System.out.println("DIFERENCA = " + DIFERENCA);

        teclado.close();

    }
    
}
