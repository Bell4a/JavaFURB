
import java.util.Scanner;

public class Uni2Ex12 {
    
    public static void main(String[] args) {
        
        double x2, x1, y2, y1, distancia;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o valor de x2: ");
        x2 = teclado.nextDouble();
        System.out.println("Digite o valor de x1: ");
        x1 = teclado.nextDouble();
        System.out.println("Digite o valor de y2: ");
        y2 = teclado.nextDouble();
        System.out.println("Digite o valor de y1: ");
        y1 = teclado.nextDouble();

        distancia = Math.sqrt((Math.pow (x2 - x1, 2)) + (Math.pow (y2 - y1, 2)));

        System.out.println(distancia);

        teclado.close();
    }
}
