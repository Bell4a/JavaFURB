import java.io.IOException;
import java.util.Scanner;

public class Bee44 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        long fib[] = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        int T = teclado.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = teclado.nextInt();
            
            System.out.printf("Fib(%d) = %d\n", N, fib[N]);
        }
        
        teclado.close();
    }
}
