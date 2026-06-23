//Caixa Loja de Roupas

import java.util.Scanner;

public class Estudo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int itens = 5;
        
        String[] nomes = new String[itens];
        int[] quantidades = new int[itens];
        double[] valoresUnitarios = new double[itens];
        double[] valoresTotais = new double[itens];
        
        // Leitura dos dados
        for (int i = 0; i < itens; i++) {
            System.out.print("Nome do item " + (i + 1) + ": ");
            nomes[i] = teclado.next();
            System.out.print("Quantidade comprada: ");
            quantidades[i] = teclado.nextInt();
            System.out.print("Valor unitário: ");
            valoresUnitarios[i] = teclado.nextDouble();
            
            valoresTotais[i] = quantidades[i] * valoresUnitarios[i];
            System.out.println("-------------------------");
        }
        
        // Ordenar de forma decrescente pelo valor total do item
        ordenarPorValorTotalDecrescente(nomes, quantidades, valoresUnitarios, valoresTotais);
        
        // a) Apresentar o relatório ordenado
        exibirRelatorio(nomes, quantidades, valoresUnitarios, valoresTotais);
        
        // b) Calcular e informar o valor total da compra
        double totalCompra = calcularTotalCompra(valoresTotais);
        System.out.printf("\nb) Valor total da compra: R$ %.2f\n", totalCompra);
        
        // c) Informar onde gastou mais e onde gastou menos
        informarMaiorMenorGasto(nomes, valoresTotais);
        
        teclado.close();
    }

    public static void ordenarPorValorTotalDecrescente(String[] nomes, int[] qtd, double[] uni, double[] tot) {
        for (int i = 0; i < tot.length - 1; i++) {
            for (int j = 0; j < tot.length - 1 - i; j++) {
                if (tot[j] < tot[j + 1]) {
                    // Ordena Totais
                    double tempTot = tot[j]; tot[j] = tot[j + 1]; tot[j + 1] = tempTot;
                    // Ordena Nomes
                    String tempNome = nomes[j]; nomes[j] = nomes[j + 1]; nomes[j + 1] = tempNome;
                    // Ordena Quantidades
                    int tempQtd = qtd[j]; qtd[j] = qtd[j + 1]; qtd[j + 1] = tempQtd;
                    // Ordena Unitários
                    double tempUni = uni[j]; uni[j] = uni[j + 1]; uni[j + 1] = tempUni;
                }
            }
        }
    }

    public static void exibirRelatorio(String[] nomes, int[] qtd, double[] uni, double[] tot) {
        System.out.println("\na) RELATÓRIO DE COMPRAS (ORDEM DECRESCENTE)");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Item: %s | Qtd: %d | Val. Unit: R$ %.2f | Total: R$ %.2f\n", 
                    nomes[i], qtd[i], uni[i], tot[i]);
        }
    }

    public static double calcularTotalCompra(double[] valoresTotais) {
        double soma = 0;
        for (double val : valoresTotais) {
            soma += val;
        }
        return soma;
    }

    public static void informarMaiorMenorGasto(String[] nomes, double[] valoresTotais) {
        int indiceMaior = 0;
        int indiceMenor = 0;
        
        for (int i = 1; i < valoresTotais.length; i++) {
            if (valoresTotais[i] > valoresTotais[indiceMaior]) {
                indiceMaior = i;
            }
            if (valoresTotais[i] < valoresTotais[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("\nc) Análise de Gastos:");
        System.out.println("Item que GASTOU MAIS: " + nomes[indiceMaior]);
        System.out.println("Item que GASTOU MENOS: " + nomes[indiceMenor]);
    }
}