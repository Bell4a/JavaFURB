import java.util.Scanner;

public class Uni4Ex26 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a opção");
        System.out.println("T - TRIÂNGULO");
        System.out.println("Q - QUADRADO");
        System.out.println("R - RETANGULO");
        System.out.println("C - CIRCULO");
        char opcao = teclado.next().charAt(0);
        
        opcao = Character.toUpperCase(opcao);

        double area = 0;

        switch (opcao) {

            case 'T': {
            System.out.println("Digite a base e a altura");
            double base = teclado.nextFloat();
            double altura = teclado.nextFloat();
            area = base * altura / 2;
            break;
        }

            case 'Q': {
            System.out.println("Digite o lado");
            double lado = teclado.nextFloat();
            area = lado * lado;
            break;
        }
            case 'R': {
            System.out.println("Digite a base e a altura");
            double base2 = teclado.nextFloat();
            double altura2 = teclado.nextFloat();
            area = base2 * altura2;
            break;
        }

            case 'C': {
            System.out.println("Digite o raio");
            double raio = teclado.nextFloat();
            area = Math.PI * raio * raio;
            break;
        }

    }
    teclado.close();
    System.out.printf("Area = " + "%.2f%n", area);
    }
}
