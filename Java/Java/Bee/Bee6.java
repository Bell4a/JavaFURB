import java.util.Scanner;

public class Bee6 {
    
    public static void main(String[] args) {
        
        int numero, horas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu número de funcionário? ");
        numero = teclado.nextInt();
        System.out.println("Quantas horas mensais você trabalha? ");
        horas = teclado.nextInt();
        System.out.println("Quanto você recebe por hora? ");
        double salarioHora = teclado.nextInt();

        double salario = horas * salarioHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf ("SALARY = %.2f", salario);

        teclado.close();
    }
}
