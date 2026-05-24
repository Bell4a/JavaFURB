import java.util.Scanner;

public class Ex1Uni2 {



    public static void main(String[] args) {
        //variaveis
        int valor1, valor2, soma;

        //classe pra leitura dos dados
        Scanner teclado = new Scanner (System.in);

        //comando de leitura
        System.err.println("Digite um número inteiro:");
        valor1 = teclado.nextInt();
        System.err.println("Digite outro número inteiro para somar:");
        valor2 = teclado.nextInt();

        //somar os valores
        soma = valor1 + valor2;

        //resultado
        System.out.println (soma);

        teclado.close();

    }
    
}
