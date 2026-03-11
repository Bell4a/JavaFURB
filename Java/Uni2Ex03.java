//Área círculo

import java.util.Scanner;

public class Uni2Ex03 {

    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio");
        double raio = teclado.nextDouble();

        //Calcular área
        double area = Math.PI * raio * raio; //ou Math.pow (raio,2);

        //Escrever área
        System.out.println("Área = " + area);

        teclado.close();
    }
    
}
