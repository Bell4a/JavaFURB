import java.util.Scanner;

public class Uni4Ex27 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int horaChegada, minChegada, horaSaida, minSaida, tempoMin, tempoHora;
        double cobranca;

        System.out.println("Digite a hora e depois os minutos em que chegou");
        horaChegada = teclado.nextInt();
        minChegada = teclado.nextInt();

        System.out.println("Digite a hora e depois os minutos em que saiu");
        horaSaida = teclado.nextInt();
        minSaida = teclado.nextInt();

        teclado.close();

        tempoMin = minSaida - minChegada;
        tempoHora = horaSaida - horaChegada;

        if (tempoHora == 0 && tempoMin < 30) {
            tempoHora = 1;
        } else {
            if (tempoMin > 30) {
                tempoHora = tempoHora + 1;
            } 

        }

        if (tempoHora == 1 || tempoHora == 2) {
            cobranca = tempoHora * 5;
        } else {
            if (tempoHora == 1 || tempoHora == 4) {
                cobranca = tempoHora * 7.50;
            } else {
                cobranca = tempoHora * 10;
            }
        }

        System.out.println("Preço Cobrado = " + cobranca);
    }
}
