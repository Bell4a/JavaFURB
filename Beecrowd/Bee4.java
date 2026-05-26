import java.util.Scanner;

public class Bee4 {

    public static void main(String[] args) {
        //variaveis
        Double A, B, MEDIA;

        //classe pra leitura dos dados
        Scanner teclado = new Scanner (System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        //somar os valores
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        //resultado
        System.out.printf ("MEDIA = %.5f", MEDIA);

        teclado.close();

    }
    
}
