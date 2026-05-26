import java.util.Scanner;

public class Bee38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int fat = 1;

        // O loop começa no valor de N e vai descendo até 1
        for (int i = N; i >= 1; i--) {
            fat = fat * i; // Multiplica o valor acumulado pelo número atual
        }

        System.out.println(fat);

        teclado.close();
    }
}