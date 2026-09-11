import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluguel aluguel = new Aluguel();
        
        System.out.print("Quantidade de dias do alguel: ");
        int dias = scanner.nextInt();
        aluguel.setQtdDias(dias);
        
        System.out.print("Quantidade de passageiros: ");
        int passageiros = scanner.nextInt();
        aluguel.setQtdPassageiros(passageiros);

        System.out.println("Dias alugados: " + aluguel.getQtdDias());
        System.out.println("Passageiros: " + aluguel.getQtdPassageiros());
        System.out.println("Valor da diária: " + aluguel.getValorDiaria());

        if (aluguel.getQtdPassageiros() > 4) {
            int excedentes = aluguel.getQtdPassageiros() - 4;
            System.out.println("Passageiros excedentes: " + excedentes + " (R$ 20,00 por passageiro excedente por dia)");
        }
        
        double valorTotal = aluguel.calcularValorAluguel();
        System.out.println("Valor total do aluguel: R$ " + valorTotal);
        
        scanner.close();
    }
}