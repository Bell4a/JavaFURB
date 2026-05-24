import java.util.Scanner;

public class Uni4Ex1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas mensais você trabalha? ");
        double horas = teclado.nextInt();
        System.out.println("Quanto você recebe por hora? ");
        double salarioHora = teclado.nextInt();
        double salarioTotal = 0.0;
        
        if (horas > 160) {
            //calcular hr extra
            double horaExtra = (horas - 160) * salarioHora * 1.5;

            //calcular salário com hora extra
            salarioTotal = 160 * salarioHora + (horaExtra);
        
        } else {
            //sem hora extra
            salarioTotal = horas * salarioHora;
        }
        //escrever salário
        System.out.println("Salário Total = " + salarioTotal);
        
        teclado.close();
    }
}
