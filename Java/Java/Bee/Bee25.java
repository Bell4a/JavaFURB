import java.io.IOException;
import java.util.Scanner;

public class Bee25 {
    
    public static void main(String[] args) throws IOException {
    
    Scanner teclado = new Scanner(System.in);   

    int inicio = teclado.nextInt();
    int fim = teclado.nextInt();

    teclado.close();

    int duracao = 0;

    //verificar se é maior

    if (inicio < fim) {
        duracao = fim - inicio;
    } else {
        if (inicio > fim) {
            duracao = 
        } else {
            System.out.println("Valor inválido");
        }
    }

    System.out.println("O JOGO DUROU " + duracao + " HORA(S)" );

    }
}
