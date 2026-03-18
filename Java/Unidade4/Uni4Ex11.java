import java.util.Scanner;

public class Uni4Ex11 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int irmao1, irmao2, irmao3;
        System.out.println("Digite a idade de um irmão ");
        irmao1 = teclado.nextInt();
        System.out.println("Digite a idade de outro irmão");
        irmao2 = teclado.nextInt();
        System.out.println("Digite a idade de outro irmão");
        irmao3 = teclado.nextInt();

        teclado.close();

        if (irmao1 == irmao2 && irmao1 == irmao3) {
            System.out.println("São trigêmeos");
        } else {
            if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
                System.out.println("São gêmeos");
            } else {
                System.out.println("Não são gêmeos/trigêmeos");
            }
        }

    }
}
