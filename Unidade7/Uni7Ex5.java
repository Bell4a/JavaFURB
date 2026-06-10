import java.util.Scanner;

public class Uni7Ex5 {

    // Verfiica parênteses
    private boolean expressaoCorreta(String expressao) {

        int contParenteses = 0;
        boolean correto = false;
        int posicaoOperador = 0;

        for (int cont = 0; cont < expressao.length(); cont++) {
            if (expressao.charAt(cont) == '(') {
                contParenteses++;
            } else {
                if (expressao.charAt(cont) == ')') {
                    contParenteses--;
                }
            }
        }
        //Verificar se tem mias parênbteses fechados que abertos
        if (contParenteses == 0) {
                correto = true;
            }

        return correto;

        //Ou return contParenteses == 0 ? true : false;
    }

    // Conta divisões e multiplicações
    private int contarDivMult(String expressao) {

        int qtdDivMult = 0;

        for (int cont = 0; cont < expressao.length(); cont++) {
            if (expressao.charAt(cont) == '/' || expressao.charAt(cont) == '*' ) {
                qtdDivMult++;
            }
        }

        return qtdDivMult;

    }

    // Mostra a posição do primeiro operador
    private int primeiroOperador(String expressao) {

        int posicaoOperador = 0;

        for (int cont = 0; cont < expressao.length(); cont++) {
            if (expressao.charAt(cont) == '*' || expressao.charAt(cont) == '/' || expressao.charAt(cont) == '-' || expressao.charAt(cont) == '+' ) {
                posicaoOperador = cont;
                break;
                // Ou return cont
            } else {
                posicaoOperador = -1;
            }
        }

        return posicaoOperador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Criar um objeto para usar os métodos da classe
        Uni7Ex5 exercicio = new Uni7Ex5();

        // Ler expressão
        System.out.println("Digite a expressão: ");
        String expressao = teclado.nextLine();

        // Repitir para várias expressões
        while (!expressao.equalsIgnoreCase("fim")) {

            // Testar se a expresão está correta quanto ao número de ()
            if (exercicio.expressaoCorreta(expressao)) {

                int qtdDivMult = exercicio.contarDivMult(expressao);
                System.out.println("Quantidade de divisões e multiplicações: " + qtdDivMult);

                int posicaoOperador = exercicio.primeiroOperador(expressao);
                if (posicaoOperador > -1) {
                System.out.println("Posição do primeiro operador: " + posicaoOperador);
                } else {
                    System.out.println("Não existe operador aritmético na expressão");
                }
            } else {
                System.out.println("Expressão incorreta quanto ao uso dos parênteses");
            }

            System.out.println("Digite uma expressão: ");
            expressao = teclado.nextLine();
        }
    }
}
