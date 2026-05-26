import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();
        double salario = teclado.nextDouble();
        double montante = teclado.nextDouble();
        
        teclado.close();
        
        double total = salario + montante * 0.15;

        System.out.printf("TOTAL = R$ " + "%.2f%n", total);

    }
}
