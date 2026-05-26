import java.io.IOException;
import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int totalItens = 5;
        
        // Vetores paralelos para armazenar os dados dos 5 itens
        int[] codigoItem = new int[totalItens];
        int[] quantidades = new int[totalItens];
        double[] valoresUnitarios = new double[totalItens];
        double[] valoresTotais = new double[totalItens];
        
        double valorTotalCompra = 0;
        
        // 1. Entrada de dados
        for (int i = 0; i < totalItens; i++) {
            System.out.println("--- Item " + (i + 1) + " ---");
            
            System.out.print("Digite o CÓDIGO do item (inteiro): ");
            codigoItem[i] = teclado.nextInt();
            
            System.out.print("Quantidade de peças: ");
            quantidades[i] = teclado.nextInt();
            
            System.out.print("Valor unitário: ");
            valoresUnitarios[i] = teclado.nextDouble();
            
            // Cálculo do valor total do item
            valoresTotais[i] = quantidades[i] * valoresUnitarios[i];
            valorTotalCompra += valoresTotais[i];
        }
        
        // 2. Ordenação Decrescente pelo Valor Total (Bubble Sort)
        // Se o próximo for maior que o atual, trocamos TODOS os vetores de posição
        for (int i = 0; i < totalItens - 1; i++) {
            for (int j = 0; j < totalItens - 1 - i; j++) {
                if (valoresTotais[j] < valoresTotais[j + 1]) {
                    
                    // Troca o Valor Total
                    double tempTotal = valoresTotais[j];
                    valoresTotais[j] = valoresTotais[j + 1];
                    valoresTotais[j + 1] = tempTotal;
                    
                    // Troca o Código do Item (Sincronização)
                    int tempCodigo = codigoItem[j];
                    codigoItem[j] = codigoItem[j + 1];
                    codigoItem[j + 1] = tempCodigo;
                    
                    // Troca a Quantidade (Sincronização)
                    int tempQtd = quantidades[j];
                    quantidades[j] = quantidades[j + 1];
                    quantidades[j + 1] = tempQtd;
                    
                    // Troca o Valor Unitário (Sincronização)
                    double tempUnitario = valoresUnitarios[j];
                    valoresUnitarios[j] = valoresUnitarios[j + 1];
                    valoresUnitarios[j + 1] = tempUnitario;
                }
            }
        }
        
        // a) Apresentação do Relatório Ordenado
        System.out.println("\n================= A) RELATÓRIO DE VENDAS =================");
        System.out.println("CÓDIGO    | QUANTIDADE | VALOR UNIT. | VALOR TOTAL");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < totalItens; i++) {
            System.out.printf("Item %-5d| %-11d| R$ %-9.2f| R$ %.2f\n", 
                codigoItem[i], quantidades[i], valoresUnitarios[i], valoresTotais[i]);
        }
        
        // b) Informar o valor total da compra
        System.out.println("\n================= B) TOTAL DA COMPRA =================");
        System.out.printf("Valor total acumulado do cupom fiscal: R$ %.2f\n", valorTotalCompra);
      
    }
}