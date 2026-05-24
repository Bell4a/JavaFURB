import java.util.Scanner;

public class Uni4Ex10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int samara, bella, mauricio;
        System.out.println("Digite a idade de Samara: ");
        samara = teclado.nextInt();
        System.out.println("Digite a idade de Bella");
        bella = teclado.nextInt();
        System.out.println("Digite a idade de Maurício");
        mauricio = teclado.nextInt();

        teclado.close();

        if (samara < bella && samara < mauricio) {
            System.out.println("Samara é a caçula");
        } else {
            if (bella < samara && bella < mauricio) {
                System.out.println("Bella é a caçula");
            } else {
                System.out.println("Maurício é o caçula");
            }
        }

    }
}
