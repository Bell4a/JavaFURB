import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        int horas = teclado.nextInt();
        float salarioHora = teclado.nextFloat();

        float salario = horas * salarioHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ " + "%.2f%n", salario);

        teclado.close();
        
    }
 
}
