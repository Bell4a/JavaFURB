import java.io.IOException;
import java.util.Scanner;

public class Bee41 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int N[] = new int[10];
        
        int V = teclado.nextInt();
        
        N[0] = V;
        System.out.printf("N[0] = %d\n", N[0]);
        
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
        
        teclado.close();
    }
}