import java.util.Scanner;

public class Uni5Ex33 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        long voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, votoNulo = 0, votoBranco = 0;
        System.out.println("Digite seu voto (1, 2, 3, 4; 5 para nulo; 6 para voto em branco; 0 para encerrar");
        byte voto = teclado.nextByte();
        

        do {
            switch (voto) {

                case 1: voto1 ++; break;
                case 2: voto2 ++; break;
                case 3: voto3 ++; break;
                case 4: voto4 ++; break;
                case 5: votoNulo ++; break;
                case 6: votoBranco ++; break;
                default: 
                    if (voto > 6)
                        System.out.println("Opção Inválida");
            }
        } while (voto > 0);
        System.out.println("Votos Candidato 1: " + voto1);
        System.out.println("Votos Candidato 2: " + voto2);
        System.out.println("Votos Candidato 3: " + voto3);
        System.out.println("Votos Candidato 4: " + voto4);
        System.out.println("Votos Nulos: " + votoNulo);
        System.out.println("Votos em Branco: " + votoBranco);
        long totalVotos = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco;
        // float força a divisão aceitar números decimais
        System.out.println("Percentual de votos brancos e nulos" + (float)(votoNulo + votoBranco) / totalVotos * 100.0);
    }
}
