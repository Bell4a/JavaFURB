//Estação Metereológica

import java.util.Scanner;

public class Estudo1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias = 7;
        
        double[] minimas = new double[dias];
        double[] maximas = new double[dias];
        
        // Leitura dos dados
        System.out.println("Entrada de Dados Meteorológicos: ");
        for (int i = 0; i < dias; i++) {
            System.out.print("Dia " + (i + 1) + " - Temp Mínima: ");
            minimas[i] = teclado.nextDouble();
            System.out.print("Dia " + (i + 1) + " - Temp Máxima: ");
            maximas[i] = teclado.nextDouble();
        }
        
        System.out.println("\nResultados: ");
        
        // a) Temperatura média da semana
        double mediaSemana = calcularMediaSemana(minimas, maximas);
        System.out.printf("a) Temperatura média da semana: %.2f\n", mediaSemana);
        
        // b) Quantos dias registraram temperaturas abaixo da média da semana
        // O enunciado diz "temperaturas abaixo da média", calculamos com base nas médias diárias
        int diasAbaixo = contarDiasAbaixoMedia(minimas, maximas, mediaSemana);
        System.out.println("b) Quantidade de dias abaixo da média: " + diasAbaixo);
        
        // c) Frequência de cada temperatura mínima distinta
        System.out.println("c) Frequência das temperaturas mínimas:");
        mostrarFrequenciaMinimas(minimas);
        
        // d) Vezes que a máxima foi maior que a do dia imediatamente anterior
        int maximasMaiores = contarMaximasMaioresAnterior(maximas);
        System.out.println("d) Vezes que a máxima superou o dia anterior: " + maximasMaiores);
        
        teclado.close();
    }

    public static double calcularMediaSemana(double[] minimas, double[] maximas) {
        double somaMediasDiarias = 0;
        for (int i = 0; i < minimas.length; i++) {
            somaMediasDiarias += (minimas[i] + maximas[i]) / 2.0;
        }
        return somaMediasDiarias / minimas.length;
    }

    public static int contarDiasAbaixoMedia(double[] minimas, double[] maximas, double mediaSemana) {
        int contador = 0;
        for (int i = 0; i < minimas.length; i++) {
            double mediaDia = (minimas[i] + maximas[i]) / 2.0;
            if (mediaDia < mediaSemana) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarFrequenciaMinimas(double[] minimas) {
        boolean[] visitado = new boolean[minimas.length];
        
        for (int i = 0; i < minimas.length; i++) {
            if (visitado[i]) {
                continue;
            }
            
            int cont = 1;
            for (int j = i + 1; j < minimas.length; j++) {
                if (minimas[i] == minimas[j]) {
                    visitado[j] = true;
                    cont++;
                }
            }
            System.out.printf("   Temp %.1f repetiu: %d vez(es)\n", minimas[i], cont);
        }
    }

    public static int contarMaximasMaioresAnterior(double[] maximas) {
        int contador = 0;
        for (int i = 1; i < maximas.length; i++) {
            if (maximas[i] > maximas[i - 1]) {
                contador++;
            }
        }
        return contador;
    }
}