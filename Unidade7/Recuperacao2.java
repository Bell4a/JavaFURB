// Isabella Mondini e Rafael da Costa Michel

import java.util.Scanner;

public class Recuperacao2 {

    // Subprograma que gera os valores aleatórios do dado jogados 5 vezes
    private int[] gerarValores() {

        int vetorValores[] = new int[5]; // Vetor para os resultados dos dados jogados

        for (int cont = 0; cont < 5; cont++) {
            vetorValores[cont] = (int) (Math.random() * 6) + 1;
        }
        return vetorValores;
    }

    private int calcularPontuacao(int vetorValores[]) {

        // Vetor de frequência pra contar ocorrência de cada número
        int frequencia[] = new int[7];

        for (int cont = 0; cont < 5; cont++) {
            frequencia[vetorValores[cont]]++;
        }

        // Boolean pra ver repetições

        boolean cinco = false;
        boolean quatro = false;
        boolean tres = false;
        boolean dois = false;

        for (int cont = 1; cont <= 6; cont++) {
            if (frequencia[cont] == 5)
                cinco = true;
            if (frequencia[cont] == 4)
                quatro = true;
            if (frequencia[cont] == 3)
                tres = true;
            if (frequencia[cont] == 2)
                dois = true;

            if (cinco) {
                return 80;

            }
            // SEQUENCIA
            if ((frequencia[1] == 1 && frequencia[2] == 1 && frequencia[3] == 1 && frequencia[4] == 1
                    && frequencia[5] == 1) ||
                    (frequencia[2] == 1 && frequencia[3] == 1 && frequencia[4] == 1 && frequencia[5] == 1
                            && frequencia[6] == 1)) {
                return 50;
            }

            if (quatro) {
                return 40;
            }

            if (tres && dois) {
                return 35;
            }

            if (tres) {
                return 30;
            }

        }

        return somar(vetorValores);
    }

    private int somar (int vetorValores[]) {

        int soma = 0;

        for (int cont = 0; cont < 5; cont++) {
            soma += vetorValores[cont];
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Recuperacao2 exercicio = new Recuperacao2();

        int opcao, soma;
        int vetorValores[] = new int[5];
        int totalRodadas = 0;
        int pontuacaoTotal = 0;

        do {
            System.out.println("1 - Jogar Rodada");
            System.out.println("2 - Exibir Pontuação");
            System.out.println("3 - Encerrar Jogo");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1: {
                    vetorValores = exercicio.gerarValores();
                    for (int cont = 0; cont < 5; cont++) {
                        System.out.println("Valores gerados: " + vetorValores[cont]);
                    }

                    soma = exercicio.calcularPontuacao(vetorValores);
                    pontuacaoTotal += soma;
                    totalRodadas++;

                    break;
                }


                case 2: {
                    soma = exercicio.calcularPontuacao(vetorValores);
                    System.out.println("Quantidade de rodadas jogadas: " + totalRodadas);
                    System.out.println("Pontuação total: " + pontuacaoTotal);
                    break;
                }
            }
        } while (opcao >= 1 && opcao <= 2);
    }
}
