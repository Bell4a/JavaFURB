import java.io.IOException;
import java.util.Scanner;

public class Bee31 {
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        for (int cont = 1; cont <= n; cont++) {
          //ler o num
          int numero = teclado.nextInt();

            //testar se o número é divisível por 2
            if (numero % 2 == 0 && numero > 0) {
                System.out.println("EVEN POSITIVE");
            } else {
                if (numero % 2 == 0 && numero < 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    if (numero % 2 != 0 && numero > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        if (numero % 2 != 0 && numero < 0) {
                            System.out.println("ODD NEGATIVE");
                        } else {
                            System.out.println("NULL");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
