import java.util.Scanner;

public class Uni5Ex16 {
    
    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);

        double somaAlturaF = 0; //Fem
        int contF = 0;
        double somaAltura = 0;  //Todos
        int cont = 0;
        System.out.println("Digite a altura: ");
        float altura = teclado.nextFloat();

            while (altura != 0) {

                System.out.println("Digite o gênero (F, M ou O): ");
                char genero = teclado.next().charAt(0);

                somaAltura += altura;
                cont ++; //Acrescenta uma unidade na variável, como se fosse += 1

                if (genero == 'F' || genero == 'f') {
                    somaAlturaF += altura;
                    contF ++;
                }

                System.out.println("Digite a altura (ou 0 para terminar): ");
                altura = teclado.nextFloat();
            
            }
            if (cont > 0) {
                System.out.println("Média de altura do grupo: " + somaAltura/cont);
            } else {
                System.out.println("Nenhum dado informado");
            }
            if (contF > 0) {
                System.out.println("Média da altura das mulheres: " + somaAlturaF/contF);
            } else {
                System.out.println("Nenhum dado feminino informado");
            }
        teclado.close();  
    }
}
