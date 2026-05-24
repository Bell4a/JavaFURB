import java.util.Scanner;

public class Uni5Ex17 {
    
    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);

        double somaAltura = 0;
        int cont = 0;
        System.out.println("Digite a altura: ");
        float altura = teclado.nextFloat();
        System.out.println("Digite o número de inscrição ");
        int inscricao = teclado.nextInt();

            while (altura != 0) {

                System.out.println("Digite o número de inscrição ");
                inscricao = teclado.nextInt();

                somaAltura += altura;
                cont ++; //Acrescenta uma unidade na variável, como se fosse += 1


                System.out.println("Digite a altura (ou 0 para terminar): ");
                altura = teclado.nextFloat();
            
            }

            System.out.println("O atleta mais baixo tem: " + altura + " e o seu número de inscrição é: " + inscricao);
            System.out.println("O atleta mais alto tem: " + altura + " e o seu número de inscrição é: " + inscricao);

            if (cont > 0) {
                System.out.println("Média de altura do grupo: " + somaAltura/cont);
            } else {
                System.out.println("Nenhum dado informado");
            }

        teclado.close();  
    }
}
