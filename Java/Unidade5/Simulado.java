import java.util.Scanner;

public class Simulado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas vezes a porta teve alguma modificação? ");
        int registro = teclado.nextInt();

        int situacao = 0;
        int somaAberta = 0;
        int tempoMaior = 0;
        int vezesAberta = 0;

        for (int cont = 1; cont <= registro; cont++) {
            int antes = situacao; // guardar situação anterior da porta
            System.out.println("Digite a situação atual da porta");
            situacao = teclado.nextInt();
            // Verificar se a porta foi aberta
            if (situacao == 1 && antes == 0) {
                vezesAberta++;
            }
            //verificar se a porta ta aberta pra contar o tempo
            if (situacao ==1) {
                somaAberta += 5;
                //maior tempo
                if (somaAberta > tempoMaior) {
                    tempoMaior = somaAberta;
                }
            } else {
                somaAberta = 0; 
            }
        }

        System.out.println("Quantidade de vezes que a porta ficou aberta: " + vezesAberta);
        System.out.println("Tempo mais longo em que a porta ficou aberta: " + tempoMaior);
    }
}
