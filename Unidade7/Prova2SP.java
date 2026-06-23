import java.util.Scanner;

public class Prova2SP {

    public static void main(String[] args) {
        // Scanner renomeado para 'teclado'
        Scanner teclado = new Scanner(System.in);

        // a) Leia a quantidade de dias a ser analisada (n)
        System.out.print("Digite a quantidade de dias (n): ");
        int n = teclado.nextInt();

        double[] nivelRio = new double[n];
        double[] chuva = new double[n];

        // b) Leia o nível do rio em cada um dos n dias
        System.out.println("Digite o nível do rio para cada dia:");
        for (int i = 0; i < n; i++) {
            System.out.print("Dia " + i + ": ");
            nivelRio[i] = teclado.nextDouble();
        }

        // c) Leia a quantidade de chuva em cada um dos n dias
        System.out.println("Digite a quantidade de chuva para cada dia:");
        for (int i = 0; i < n; i++) {
            System.out.print("Dia " + i + ": ");
            chuva[i] = teclado.nextDouble();
        }

        System.out.println("\n--- RESULTADOS ---");

        // d) Subiu no dia de maior chuva
        double subiuMaiorChuva = calcularSubidaNoDiaDeMaiorChuva(nivelRio, chuva);
        System.out.printf("Quantidade de metros que o rio subiu no dia de maior chuva = %.1f\n", subiuMaiorChuva);

        // e) Maior período consecutivo acima do nível ideal (3.0m)
        int maiorPeriodoAcima = calcularMaiorPeriodoAcimaIdeal(nivelRio);
        System.out.println("Maior período consecutivo do rio acima do nível ideal: " + maiorPeriodoAcima + " dias");

        // f) Análise de período personalizado
        System.out.print("\nDigite o dia inicial para a análise de período: ");
        int diaInicial = teclado.nextInt();
        System.out.print("Digite o dia final para a análise de período: ");
        int diaFinal = teclado.nextInt();

        // Validação simples dos dias informados
        if (diaInicial >= 0 && diaFinal < n && diaInicial <= diaFinal) {
            double diferencaNivel = calcularDiferencaNivel(nivelRio, diaInicial, diaFinal);
            double mediaChuva = calcularMediaChuvaPeriodo(chuva, diaInicial, diaFinal);

            // Formatação do sinal de + ou - para a diferença do nível
            String sinal = (diferencaNivel >= 0) ? "+" : "";
            System.out.printf("Diferença do nível do rio entre os dias %d e %d: %s%.1f\n", diaInicial, diaFinal, sinal, diferencaNivel);
            System.out.printf("Média de chuvas nestes dias: %.0f\n", mediaChuva);
        } else {
            System.out.println("Dias inválidos para o período.");
        }

        teclado.close();
    }

    //Subprogramas

    public static double calcularSubidaNoDiaDeMaiorChuva(double[] nivelRio, double[] chuva) {
        int indiceMaiorChuva = 0;
        double maiorChuva = chuva[0];

        // Encontra o índice do dia com a maior chuva
        for (int i = 1; i < chuva.length; i++) {
            if (chuva[i] > maiorChuva) {
                maiorChuva = chuva[i];
                indiceMaiorChuva = i;
            }
        }

        // Calcula a variação de nível em relação ao dia anterior
        double nivelDiaAtual = nivelRio[indiceMaiorChuva];
        double nivelDiaAnterior;

        if (indiceMaiorChuva == 0) {
            nivelDiaAnterior = 3.0; // Caso seja o primeiro dia, o nível anterior padrão é 3.0
        } else {
            nivelDiaAnterior = nivelRio[indiceMaiorChuva - 1];
        }

        return nivelDiaAtual - nivelDiaAnterior;
    }

    // e) Calcula o maior período consecutivo de dias em que o rio ficou acima de 3.0m.

    public static int calcularMaiorPeriodoAcimaIdeal(double[] nivelRio) {
        int maxPeriodo = 0;
        int periodoAtual = 0;
        double nivelIdeal = 3.0;

        for (int i = 0; i < nivelRio.length; i++) {
            if (nivelRio[i] > nivelIdeal) {
                periodoAtual++;
                if (periodoAtual > maxPeriodo) {
                    maxPeriodo = periodoAtual;
                }
            } else {
                periodoAtual = 0; // Reseta se quebrar a sequência
            }
        }
        return maxPeriodo;
    }

    // f.1) Calcula a diferença do nível do rio entre o dia final e o dia inicial.

    public static double calcularDiferencaNivel(double[] nivelRio, int diaInicial, int diaFinal) {
        return nivelRio[diaFinal] - nivelRio[diaInicial];
    }

    //f.2) Calcula a média aritmética das chuvas em um intervalo de dias (inclusive).
    
    public static double calcularMediaChuvaPeriodo(double[] chuva, int diaInicial, int diaFinal) {
        double soma = 0;
        int totalDias = (diaFinal - diaInicial) + 1;

        for (int i = diaInicial; i <= diaFinal; i++) {
            soma += chuva[i];
        }

        return soma / totalDias;
    }
}