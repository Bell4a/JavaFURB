//Área círculo

import java.util.Scanner;

public class Bee2 {

    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio");
        double raio = teclado.nextDouble();

        //Calcular área
        double area = 3.14159 * Math.pow (raio,2);

        //Escrever área
        System.out.printf("A=%.4f", area);

        teclado.close();
    }
    
}
