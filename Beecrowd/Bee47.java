import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int C = teclado.nextInt();
        char T = teclado.next().charAt(0);
        
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = teclado.nextDouble();
            }
        }
        
        double soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += M[i][C];
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
