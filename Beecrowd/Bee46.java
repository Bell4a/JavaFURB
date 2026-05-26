import java.io.IOException;
import java.util.Scanner;

public class Bee46 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int L = teclado.nextInt();
        char T = teclado.next().charAt(0);
    
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = teclado.nextDouble();
            }
        }
        
        double soma = 0;
        for (int j = 0; j < 12; j++) {
            soma += M[L][j];
        }
        
        if (T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (T == 'M') {
       
            double media = soma / 12.0;
            System.out.printf("%.1f\n", media);
        }
        
        teclado.close();
    }
}
