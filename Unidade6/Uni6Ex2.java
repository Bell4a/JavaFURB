import java.util.Scanner;

public class Uni6Ex2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        float x[] = new float[12];
        float soma = 0;

        for (int cont = 0; cont <= 11; cont++) {
            System.out.println("Digite o valor: " + cont);
            x[cont] = teclado.nextFloat();
            soma += x[cont];
        }

        float media = soma / 12;

        for (int cont = 0; cont <= 11; cont++)
            if (x[cont] > media) {
                System.out.println(x[cont]);
            }

        System.out.println("Média = " + media);
    }
}
