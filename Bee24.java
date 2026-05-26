//Intervalo
import java.io.IOException;
import java.util.Scanner;

public class Bee24 {
    
    public static void main(String[] args) throws IOException {
        
    Scanner teclado = new Scanner (System.in);
    
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    int valor3 = teclado.nextInt();

    teclado.close();

    int maior = 0;
    int meio = 0;
    int menor = 0;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else {
            if (valor2 > valor1 && valor2 > valor3) {
                maior = valor2;
            } else {
                maior = valor3;
            }
        }

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else {
            if (valor2 < valor1 && valor2 < valor3) {
                menor = valor2;
            } else {
                menor = valor3;
            }
        }

        meio = (valor1 + valor2 + valor3) - (maior + menor);

    System.out.println(menor);
    System.out.println(meio);
    System.out.println(maior);
    System.out.println("");
    System.out.println(valor1);
    System.out.println(valor2);
    System.out.println(valor3);

    }
}
