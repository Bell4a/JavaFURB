import java.util.Scanner;

public class Uni2Ex17 {
    
    public static void main(String[] args) {

        double horasMensais, dependentes, salarioTrabalho, salarioFamilia, salarioBruto, salarioLiquido, descontoIDR, descontoINSS;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine(); 
        System.out.println("Digite as horas mensais trabalhadas");
        horasMensais = teclado.nextInt();
        System.out.println("Digite o número de dependentes");
        dependentes = teclado.nextInt();

        salarioTrabalho = horasMensais * 10;
        salarioFamilia = dependentes * 60;
        salarioBruto = salarioTrabalho + salarioFamilia;
        descontoINSS = salarioTrabalho - (salarioTrabalho * 0.085);
        descontoIDR = salarioTrabalho - (salarioTrabalho * 0.05);
        salarioLiquido = salarioBruto - (descontoINSS + descontoIDR);

        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);



        teclado.close();

    }
}
