import java.util.Scanner;

public class Uni6Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Criação dos vetores para armazenar as 5 respostas
        String respostasRapaz[] = new String[5];
        String respostasMoca[] = new String[5];
        
        System.out.println("--- Respostas do Rapaz (SIM, NAO ou IND) ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            respostasRapaz[i] = teclado.next();
        }
        
        System.out.println("\n--- Respostas da Moça (SIM, NAO ou IND) ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            respostasMoca[i] = teclado.next();
        }
        
        int afinidade = 0;
        
        for (int i = 0; i < 5; i++) {
            String r = respostasRapaz[i];
            String m = respostasMoca[i];
            
            if (r.equalsIgnoreCase(m)) {
                afinidade += 3;
            } else if (r.equalsIgnoreCase("IND") || m.equalsIgnoreCase("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        
        System.out.println("\nPontuação final: " + afinidade);
        System.out.print("Mensagem: ");
        
        if (afinidade == 15) {
            System.out.println("“Casem!”");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("“Você têm muita coisa em comum!”");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("“Talvez não dê certo :(”");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("“Vale um encontro.”");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("“Melhor não perder tempo”");
        } else if (afinidade <= -10) {
            System.out.println("“Vocês se odeiam!”");
        }
        
        teclado.close();
    }
}