import java.io.IOException;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int totalDias = 7;
        double[] minimas = new double[totalDias];
        double[] maximas = new double[totalDias];
        double[] mediasDiarias = new double[totalDias];
        
        double somaMediasDiarias = 0;
        
        // 1. Leitura dos dados e cálculo das médias diárias
        for (int i = 0; i < totalDias; i++) {
            System.out.println("--- Dia " + (i + 1) + " ---");
            System.out.print("Temperatura Mínima: ");
            minimas[i] = teclado.nextDouble();
            
            System.out.print("Temperatura Máxima: ");
            maximas[i] = teclado.nextDouble();
            
            // Média do dia corrente
            mediasDiarias[i] = (minimas[i] + maximas[i]) / 2.0;
            somaMediasDiarias += mediasDiarias[i];
        }
        
        // a) Temperatura média da semana
        double mediaSemanal = somaMediasDiarias / totalDias;
        System.out.printf("\na) Temperatura média da semana: %.2f°C\n", mediaSemanal);
        
        // b) Contagem de dias com temperatura abaixo da média semanal
        int diasAbaixoDaMedia = 0;
        for (int i = 0; i < totalDias; i++) {
            if (mediasDiarias[i] < mediaSemanal) {
                diasAbaixoDaMedia++;
            }
        }
        System.out.println("b) Quantidade de dias abaixo da média semanal: " + diasAbaixoDaMedia);
        
        // c) Frequência de cada temperatura mínima distinta
        System.out.println("c) Frequência das temperaturas mínimas:");
        boolean[] contado = new boolean[totalDias];
        
        for (int i = 0; i < totalDias; i++) {
            if (contado[i]) {
                continue;
            }
            
            int frequencia = 1;
            for (int j = i + 1; j < totalDias; j++) {
                if (minimas[i] == minimas[j]) {
                    frequencia++;
                    contado[j] = true;
                }
            }
            System.out.printf("   A temperatura %.1f°C se repetiu %d vez(es)\n", minimas[i], frequencia);
        }
        
        // d) Quantidade de vezes que a máxima foi maior que a do dia imediatamente anterior
        int maximasMaioresQueAnterior = 0;
        // Começa em 1 porque o dia 0 não possui dia anterior
        for (int i = 1; i < totalDias; i++) {
            if (maximas[i] > maximas[i - 1]) {
                maximasMaioresQueAnterior++;
            }
        }
        System.out.println("d) Quantidade de vezes que a máxima superou o dia anterior: " + maximasMaioresQueAnterior);
        
        teclado.close();
    }
}