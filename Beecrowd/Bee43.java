//Intervalo
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
    Scanner teclado = new Scanner (System.in);
    
    Float valorX = teclado.nextFloat();
    Float valorY = teclado.nextFloat();

    teclado.close();

    if (valorX > 0 && valorY > 0) {
        System.out.println("Q1");
    } else {
        if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } else {
            if (valorX > 0 && valorY < 0) {
                System.out.println("Q4");
            } else {
                if (valorX < 0 && valorY > 0) {
                    System.out.println("Q2");
                } else {
                    if (valorX == 0 && valorY != 0) {
                        System.out.println("Eixo Y");
                    } else {
                        if (valorX != 0 && valorY == 0) {
                            System.out.println("Eixo X");
                        } else {
                            if (valorX == 0 && valorY == 0) {
                                System.out.println("Origem");
                            }
                        }
                    }
                }
            }
        }
    }
    }
}
