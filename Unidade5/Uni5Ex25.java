import java.util.Scanner;

public class Uni5Ex25 {
    
    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);

        //Inicializar os pontos de cada jogador
        byte pontosD = 0, pontosE = 0;
        boolean vencedor = false; 

        do {
            //ler o ponto
            char ponto = teclado.next().charAt(0);
            ponto = Character.toUpperCase(ponto);
            //marcar o ponto
            switch (ponto) {
                case 'D': pontosD++; break;
                case 'E': pontosE++; break;
            }

            //informar o placar parcial
            System.out.printf("D %d X %d E\n", pontosD, pontosE);
            if ((pontosD >= 7) && (pontosD - pontosE >=2)) {
                System.out.println("Jogador da direita venceu!");
                vencedor = true;
            } else
                if ((pontosE >= 7) && (pontosE - pontosD >= 2)) {
                    System.out.println("Jogador da esquerda venceu!");
                    vencedor = true;
                }
        } while (!vencedor);
    }
}
