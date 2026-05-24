// WHILE (flag)
import java.util.Scanner;

public class Uni5Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Ler um nome "flag" (variável que sinaliza uma condição de fim de leitura)

        System.out.println("Digite o nome do aluno (ou fim): ");
        String nome = teclado.next();

        //Enquanto o falg (nome) não for 'fim'
        // DIFERENÇA de variável estática/primitiva (armazena conteúdo fixo) e dinâmica (endereço da memória)

            while (!nome.equalsIgnoreCase("fim")) { //String é uma classe

                System.out.println("Digite a nota 1: ");
                float nota1 = teclado.nextFloat();
                System.out.println("Digite a nota 2: ");
                float nota2 = teclado.nextFloat();
                float media = (nota1 + nota2) / 2;
    
                System.out.println("A média de " + nome + "é: " + media);

                System.out.println("Digite o nome do aluno (ou fim): ");
                nome = teclado.next();

        }
        teclado.close();
    } 
}
